package com.codegym.demo.controller;

import com.codegym.demo.model.Category;
import com.codegym.demo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categorys")
public class CategoryRestController {
    @Autowired
    private ICategoryService categoryService;
    @GetMapping
    public ResponseEntity<List<Category>> getCategoryList(){
        List<Category> categoryList= categoryService.findAll();
        if (categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);


        }
        return new ResponseEntity<>(categoryList,HttpStatus.OK);
    }

}
