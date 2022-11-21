package com.codegym.controller;

import com.codegym.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @Autowired
    private ICalculatorService calculatorService;

    @GetMapping("/")
    public String goHome() {
        return "/calculator";
    }

    @GetMapping("/result")
    public String showResult(@RequestParam String submit, double a, double b, Model model){
        double result= calculatorService.calculate(submit,a,b);
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        model.addAttribute("result",result);
        return "/calculator";

    }


}
