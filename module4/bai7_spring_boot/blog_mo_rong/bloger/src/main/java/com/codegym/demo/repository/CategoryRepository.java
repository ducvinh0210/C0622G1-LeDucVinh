package com.codegym.demo.repository;

import com.codegym.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface CategoryRepository  extends JpaRepository<Category,Integer> {
}
