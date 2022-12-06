package com.codegym.demo.repository;

import ch.qos.logback.core.boolex.EvaluationException;
import com.codegym.demo.model.Bloger;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface BlogerRepository extends JpaRepository<Bloger,Integer> {
   Page<Bloger>findAllByNameContainingOrderByDateDesc(String blogName, Pageable pageable);

   @Query(value= "select * from bloger join category on bloger.category_id = category.id where category.name=:nameCategory",nativeQuery=true)
   List<Bloger> findAllByCategory(@Param("nameCategory") String nameCategory);
}
