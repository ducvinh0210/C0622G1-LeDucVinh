package com.codegym.service;

import com.codegym.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICustomerService {
    Page<Customer> findByNameAndEmailAndCustomerType(String name, String email, String customerType, Pageable pageable);

    Optional<Customer> findById(int id);

    void save(Customer customer);

    void remove(int id);


}
