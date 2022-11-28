package com.codegym.demo.service;

import com.codegym.demo.model.Bloger;
import com.codegym.demo.model.Category;

import java.util.List;

public interface ICategoryService {
  List<Category> findAll();
  Category findById(int id);
  void save(Category category);
  void remove(Category category);



}
