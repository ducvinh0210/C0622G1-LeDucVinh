package com.codegym.service.impl;

import com.codegym.model.customer.Customer;
import com.codegym.repository.customer.CustomerRepository;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void remove(int id) {
        customerRepository.remove(id);

    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findByNameAndEmailAndCustomerType(String name, String email, String type, Pageable pageable) {
        return customerRepository.findByNameAndEmailAndCustomerType(name, email, type, pageable);
    }

    @Override
    public Page<Customer> findCustomerUsingService(String name, String email, String typeName, Pageable pageable) {
        return customerRepository.findCustomerUsingService(name, email, typeName, pageable);
    }

}
