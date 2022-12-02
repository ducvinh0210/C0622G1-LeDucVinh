package com.codegym.server.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;
import com.codegym.server.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;


    @Override
    public Iterable<Product> findAll() {
        return iProductRepository.findAll();

    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepository.findById(id);
    }
}
