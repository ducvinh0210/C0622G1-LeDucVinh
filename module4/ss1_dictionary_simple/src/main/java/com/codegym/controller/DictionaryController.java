package com.codegym.controller;

import com.codegym.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping("/")
    public String goHome() {
        return "/home";

    }

    @PostMapping("/dictionary")
    public String dictionary(@RequestParam(required = false) String eng, Model model) {
        String vie = dictionaryService.findWord(eng);
        model.addAttribute("vie", vie);
        return "/home";
    }
}
