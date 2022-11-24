package com.codegym.repository.impl;

import com.codegym.model.Customer;
import com.codegym.repository.ICustomerRepository;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository {

//    @Override
//    public List<Customer> findAll() {
//        Session session= null   ;
//        List<Customer> customerList= null;
//        try {
//            session= ConnectionUtil.sessionFactory.openSession();
//            customerList= session.createQuery("FROM Customer").getResultList();
//        }finally {
//            if (session!=null){
//                session.close();
//            }
//        }
//        return customerList;
//
//    }

    @Override
    public List<Customer> findAllAndSearch(String nameCustomer) {
        Session session = null;
        List<Customer> customerList = null;
        try {
            session = ConnectionUtil.sessionFactory.openSession();
            customerList = session.createQuery("select c FROM Customer c where name like :namex").setParameter("namex","%"+nameCustomer+"%").getResultList();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return customerList;
    }
}
