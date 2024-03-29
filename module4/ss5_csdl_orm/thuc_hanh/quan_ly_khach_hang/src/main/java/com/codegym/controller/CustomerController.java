package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

//    @GetMapping("")
//    public String index(Model model, @RequestParam(defaultValue = "",required = false) String name) {
//        List<Customer> customerList = customerService.findAllAndSearch(name);
//
//        model.addAttribute("customers", customerList);
//        return "/index";
//    }
@GetMapping("")
public String finAll(@RequestParam(defaultValue = "", required = false) String nameProduct, Model model){
    List<Customer> customerList = customerService.findAllAndSearch(nameProduct);
    model.addAttribute("customers",customerList);
    return "/index";
}

}
