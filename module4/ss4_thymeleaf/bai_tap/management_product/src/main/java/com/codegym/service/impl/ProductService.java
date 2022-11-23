package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService {
    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "Iphone14", 30000, "dang hot", "apple"));
        products.put(2, new Product(2, "SamSung", 12000, "Cung hot", "sam sung"));
        products.put(3, new Product(3, "Iphone13", 28888, "Cung duoc", "Apple"));

    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());

    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void delete(int id) {
        products.remove(id);

    }
}
