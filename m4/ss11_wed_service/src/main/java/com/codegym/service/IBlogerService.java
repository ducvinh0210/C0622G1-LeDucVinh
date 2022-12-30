package com.codegym.service;

import com.codegym.model.Bloger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogerService {
    List<Bloger> findAll();

    Bloger findById(int id);


    List<Bloger> findAllByCategory(String nameCategory);

    void save(Bloger bloger);

Page<Bloger> findAll(Pageable pageable);




}
