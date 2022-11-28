package com.codegym.demo.service.impl;

import com.codegym.demo.model.Bloger;
import com.codegym.demo.repository.BlogerRepository;
import com.codegym.demo.service.IBlogerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogerService implements IBlogerService {

    @Autowired
    BlogerRepository blogerRepository;


    @Override
    public List<Bloger> findAll() {
        return blogerRepository.findAll();
    }

    @Override
    public Bloger findById(int id) {
        return blogerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Bloger bloger) {
        blogerRepository.save(bloger);

    }

    @Override
    public void remove(Bloger bloger) {
        blogerRepository.delete(bloger);

    }

    @Override
    public Page<Bloger> findAll(Pageable pageable) {
        return blogerRepository.findAll(pageable);

    }
}
