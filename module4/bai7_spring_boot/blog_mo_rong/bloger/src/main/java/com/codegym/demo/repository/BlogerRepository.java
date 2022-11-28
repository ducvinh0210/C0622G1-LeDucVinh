package com.codegym.demo.repository;

import com.codegym.demo.model.Bloger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface BlogerRepository extends JpaRepository<Bloger,Integer> {
   Page<Bloger>findAllByNameContainingOrderByDateDesc(String blogName, Pageable pageable);






}
