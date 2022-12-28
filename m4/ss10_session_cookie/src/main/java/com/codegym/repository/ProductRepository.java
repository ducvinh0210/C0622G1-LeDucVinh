package com.codegym.repository;

import com.codegym.dto.ProductDto;
import com.codegym.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
