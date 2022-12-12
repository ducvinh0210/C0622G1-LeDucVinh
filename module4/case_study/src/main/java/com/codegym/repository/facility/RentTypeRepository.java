package com.codegym.repository.facility;

import ch.qos.logback.core.boolex.EvaluationException;
import com.codegym.model.facility.RentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RentTypeRepository extends JpaRepository<RentType,Integer> {
//    @Query(value="select * from rent_type where `status`=1",nativeQuery=true)
//        List<RentType> findAll();
}
