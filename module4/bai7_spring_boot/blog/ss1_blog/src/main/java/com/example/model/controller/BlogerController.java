package com.example.model.controller;

import com.example.model.model.Bloger;
import com.example.model.service.IBlogerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogerController {
    @Autowired
    private IBlogerService blogerService;
    @GetMapping("/create-blog")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView= new ModelAndView("/blog/create");
modelAndView.addObject("blog" ,new Bloger());
   return modelAndView;
    }
    @PostMapping("/create-blog")
    public ModelAndView createBlog(@ModelAttribute("blog") Bloger bloger){
        blogerService.save(bloger);
        ModelAndView modelAndView=new ModelAndView("/blog/create");
    modelAndView.addObject("blog",bloger);
    modelAndView.addObject("message","Blog created successfully");
    return modelAndView;
    }
    @GetMapping("/blogers")
    public ModelAndView showBlogList(){
        List<Bloger> blogers=blogerService.findAll();
        ModelAndView modelAndView= new ModelAndView("/blog/index");
   modelAndView.addObject("blogs",blogers);
   return modelAndView;
    }



}
