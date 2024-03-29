package com.codegym.demo.service.impl;

import com.codegym.demo.model.Category;
import com.codegym.demo.repository.CategoryRepository;
import com.codegym.demo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id).orElse(null);

    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);

    }

    @Override
    public void remove(Category category) {
        categoryRepository.delete(category);

    }
}
