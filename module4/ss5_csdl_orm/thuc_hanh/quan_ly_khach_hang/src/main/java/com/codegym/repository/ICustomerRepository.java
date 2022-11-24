package com.codegym.repository;

import com.codegym.model.Customer;

import java.util.List;

public interface ICustomerRepository {
//    List<Customer> findAll();
    List<Customer> findAllAndSearch(String nameCustomer);
}
