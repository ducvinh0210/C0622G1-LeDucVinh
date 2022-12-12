package com.codegym.repository.facility;

import com.codegym.model.facility.FacilityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FacilityTypeRepository extends JpaRepository<FacilityType,Integer> {
//    @Query(value="select * from facility_type where `status`=1",nativeQuery=true)
//    List<FacilityType> findAll();

}
