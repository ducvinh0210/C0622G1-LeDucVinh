package com.codegym.service.impl;

import com.codegym.model.Customer;
import com.codegym.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class CustomerService implements ICustomerService {
    private static Map<Integer,Customer> customers= new HashMap<>();
    static {
        customers.put(1,new Customer(1,"Vinh","leducvinh@gmail.com","Ha Noi"));
        customers.put(2,new Customer(2,"Vi","viyhiphak@gmail.com","Quang Nam"));
        customers.put(3,new Customer(3,"phuc","phucbh@gmail.com","viet nam"));
    }
    @Override
    public List<Customer> findAll() {
       return new ArrayList<>(customers.values());
       
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);

    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);

    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);

    }

    @Override
    public void remove(int id) {
        customers.remove(id);

    }
}
