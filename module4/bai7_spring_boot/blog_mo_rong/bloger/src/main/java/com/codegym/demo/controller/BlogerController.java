package com.codegym.demo.controller;

import com.codegym.demo.model.Bloger;
import com.codegym.demo.model.Category;
import com.codegym.demo.service.IBlogerService;
import com.codegym.demo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/blogers")
public class BlogerController {
    @Autowired
    private IBlogerService blogerService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public ModelAndView showBlogList(@PageableDefault(value = 3) Pageable pageable) {
        Page<Bloger> blogers = blogerService.findAll(pageable);
        List<Category> categories = categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("/blog/index");
        modelAndView.addObject("categories", categories);
        modelAndView.addObject("blogs", blogers);
        return modelAndView;

    }

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        List<Category> categories = categoryService.findAll();
        modelAndView.addObject("blog", new Bloger());
        modelAndView.addObject("categories", categories);
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView createBlog(@ModelAttribute("blog") Bloger bloger) {
        bloger.setDate(new Date(System.currentTimeMillis()));
        blogerService.save(bloger);
        List<Category> categories = categoryService.findAll();
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("categories", categories);
        modelAndView.addObject("blog", bloger);
        modelAndView.addObject("message","blog create successfully");

        return modelAndView;


    }


}
