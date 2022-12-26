package com.codegym.service;

import com.codegym.model.SuatChieu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ISuatChieuService {
    Page<SuatChieu> findAll(Pageable pageable);

    void save(SuatChieu suatChieu);

    Optional<SuatChieu> findById(int id);
    void remove(int id);


}
