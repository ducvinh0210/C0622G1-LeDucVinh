package com.codegym.service;

import com.codegym.model.Bloger;

import java.util.List;
import java.util.Optional;

public interface IBlogerService {
    List<Bloger> findAll();

    Bloger findById(int id);


    List<Bloger> findAllByCategory(String nameCategory);

    void save(Bloger bloger);


}
