package com.codegym.service.impl;

import com.codegym.service.IConvertingService;
import org.springframework.stereotype.Service;

@Service
public class ConvertingService implements IConvertingService {

    @Override
    public double converting(double usd) {
        return usd*23000;
    }
}
