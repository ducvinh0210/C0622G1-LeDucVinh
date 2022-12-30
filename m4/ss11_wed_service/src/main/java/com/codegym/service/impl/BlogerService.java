package com.codegym.service.impl;

import com.codegym.model.Bloger;
import com.codegym.repository.BlogerRepository;
import com.codegym.service.IBlogerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BlogerService implements IBlogerService {
    @Autowired
    private BlogerRepository blogerRepository;


    @Override
    public List<Bloger> findAll() {
        return blogerRepository.findAll();
    }

    @Override
    public Bloger findById(int id) {
        return blogerRepository.findById(id).orElse(null);
    }


    @Override
    public List<Bloger> findAllByCategory(String nameCategory) {
        return blogerRepository.findAllByCategory(nameCategory);
    }

    @Override
    public void save(Bloger bloger) {
        blogerRepository.save(bloger);

    }

    @Override
    public Page<Bloger> findAll(Pageable pageable) {
        return blogerRepository.findAll(pageable);
    }


}
