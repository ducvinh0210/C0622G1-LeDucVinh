package com.codegym.repository.facility;

import com.codegym.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface FacilityRepository extends JpaRepository<Facility, Integer> {
    @Query(value = "select `facility`.* from `facility` join `facility_type` on `facility`.facility_type_id = `facility_type`.id where `facility`.name like %:name% and `facility_type`.name like %:type% and `facility`.status=1", nativeQuery = true)
    Page<Facility> findAllByNameAndType(@Param("name") String searchName,
                                         @Param("type") String searchType,
                                         Pageable pageable);

    @Query(value = "select f.* from`facility` f join facility_type ft on f.facility_type_id=ft.id " +
            "where f.name like %:name% and ft.name like %:type% and f.status=1", nativeQuery = true)
    Page<Facility> findAllByNameAndType1(@Param("name") String nameSearch,
                                        @Param("type") String facilityType,
                                        Pageable pageable);
    @Transactional
    @Modifying
    @Query(value = "update `facility` set `facility`.status=0 where `facility`.id=:id",nativeQuery = true)
    void remove(@Param("id") int id);

}
