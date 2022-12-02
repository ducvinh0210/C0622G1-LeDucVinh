package com.codegym.controller;

import com.codegym.dto.CartDto;
import com.codegym.dto.ProductDto;
import com.codegym.model.Product;
import com.codegym.server.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping("/shop")
    public ModelAndView showShop(){
        ModelAndView modelAndView= new ModelAndView("/shop");
        modelAndView.addObject("products",productService.findAll());
        return modelAndView;
    }
@GetMapping("/add/{id}")
public String addToCart(@PathVariable Long id, @SessionAttribute CartDto cart){
    Optional<Product> productOptional= productService.findById(id);
    if (!productOptional.isPresent()){
        return "/error.404";
    }if (productOptional.isPresent()){
        ProductDto productDto= new ProductDto();
        BeanUtils.copyProperties(productOptional.get(),productDto);
        cart.addProduct(productDto);
    }
    return "redirect:/cart";
    }

}
