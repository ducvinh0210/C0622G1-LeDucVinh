package com.example.model.service;

import com.example.model.model.Bloger;
import sun.java2d.loops.Blit;

import java.util.List;

public interface IBlogerService {
    List<Bloger> findAll();

    Bloger findById(int id);

    void save(Bloger bloger);

    void remove(Bloger bloger);

    List<Bloger> findByName(String nameSearch);
}
