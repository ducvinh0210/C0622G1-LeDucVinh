package com.codegym.service;

import com.codegym.model.facility.Facility;
import com.codegym.model.facility.FacilityType;
import com.codegym.model.facility.RentType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IFacilityService {
    Page<Facility> findAllByNameAndType(String name, String type, Pageable pageable);

    Optional<Facility> findById(int id);

    void save(Facility facility);

    void remove(int id);


    List<Facility> findAll();

    List<FacilityType> findAllFacilityType();

    List<RentType> findAllRentType();


}
