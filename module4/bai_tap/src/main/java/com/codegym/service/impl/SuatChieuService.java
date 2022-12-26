package com.codegym.service.impl;

import com.codegym.model.SuatChieu;
import com.codegym.repository.SuatChieuRepository;
import com.codegym.service.ISuatChieuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SuatChieuService implements ISuatChieuService {
    @Autowired
    private SuatChieuRepository suatChieuRepository;


    @Override
    public Page<SuatChieu> findAll(Pageable pageable) {
        return suatChieuRepository.findAll(pageable);
    }

    @Override
    public void save(SuatChieu suatChieu) {
        suatChieuRepository.save(suatChieu);


    }

    @Override
    public Optional<SuatChieu> findById(int id) {
        return suatChieuRepository.findById(id);

    }

    @Override
    public void remove(int id) {
        suatChieuRepository.remove(id);
    }
}
