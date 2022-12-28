package com.codegym.controller;


import com.codegym.dto.CartDto;
import com.codegym.dto.ProductDto;
import com.codegym.model.Product;
import com.codegym.service.IProductService;
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


    @ModelAttribute("cart")
    public CartDto intiCard() {
        return new CartDto();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;

    }

    @GetMapping("/add/{id}")
    private String addToCart(@PathVariable Long id,
                             @SessionAttribute("cart") CartDto cartDto){
        Product product= productService.findById(id).orElse(null);
        ProductDto productDto= new ProductDto();
        BeanUtils.copyProperties(product,productDto);
        cartDto.addProduct(productDto);
        return "redirect:/cart";
    }
    @GetMapping("/remove/{id}")
    public String removeToCart(@PathVariable Long id,@SessionAttribute CartDto cart){
        Optional<Product> productOptional= productService.findById(id);
        if(!productOptional.isPresent()){
            return "/error.404";
        }if (productOptional.isPresent()){
            ProductDto productDto= new ProductDto();
            BeanUtils.copyProperties(productOptional.get(),productDto);
            cart.removeProduct(productDto);
        }
        return "redirect:/cart";

    }
    @GetMapping("/view/{id}")
    public ModelAndView view(@PathVariable Long id){
        Optional<Product> productOptional= productService.findById(id);
        ModelAndView modelAndView= new ModelAndView("/view");
        if (productOptional.isPresent()){
            modelAndView.addObject("product",productOptional.get());
            return modelAndView;
        }
        ModelAndView modelAndView1= new ModelAndView("/error.404");
        return modelAndView;

    }



}
