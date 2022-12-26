package com.codegym.service;

import com.codegym.model.customer.CustomerType;
import com.codegym.service.impl.CustomerTypeService;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();

}
