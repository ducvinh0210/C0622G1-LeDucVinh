package com.codegym.demo.controller;

import com.codegym.demo.model.Bloger;
import com.codegym.demo.service.IBlogerService;
import org.omg.CORBA.portable.ResponseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/blogers")
@CrossOrigin("*")
public class BlogerRestController {
    @Autowired
    private IBlogerService blogerService;

    @GetMapping
    public ResponseEntity<List<Bloger>> getBlogList() {
        List<Bloger> blogerList = blogerService.findAll();
        if (blogerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }
        return new ResponseEntity<>(blogerList, HttpStatus.OK);
    }

    @GetMapping("/view-blog/{id}")
    public ResponseEntity<Bloger> getDetailBlog(@PathVariable int id) {
        Bloger bloger = blogerService.findById(id);
        if (bloger == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(bloger, HttpStatus.OK);
    }

    @GetMapping("/search-blog/{nameCategory}")
    public ResponseEntity<List<Bloger>> getBlogByCategory(@PathVariable String nameCategory) {
        List<Bloger> blogerList = blogerService.findAllByCategory(nameCategory);
        if (blogerList == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }
        return new ResponseEntity<>(blogerList, HttpStatus.OK);
    }



}
