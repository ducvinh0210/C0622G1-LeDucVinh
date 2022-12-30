package com.codegym.repository;

import com.codegym.model.Bloger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BlogerRepository extends JpaRepository<Bloger,Integer> {
    @Query(value = "select `bloger`.* from `bloger`  join `category` on `bloger`.category_id= `category`.id where `category`.name like %:nameCategory",nativeQuery = true)
    List<Bloger>findAllByCategory(@Param("nameCategory") String nameCategory);






}
