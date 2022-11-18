package com.codegym.controller;

import com.codegym.service.IConvertingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertingController {
    @Autowired
    private IConvertingService convertingService;

    @GetMapping("/")
    public String goHome() {
        return "/home";
    }

    @PostMapping("/convert")
    public String converting(@RequestParam(required = false) double usd, Model model) {
        double vnd = convertingService.converting(usd);
        model.addAttribute("vnd", vnd);
        return "/home";
    }


}
