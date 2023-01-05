package com.codegym.repository.customer;

import ch.qos.logback.core.boolex.EvaluationException;
import com.codegym.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import sun.management.snmp.jvminstr.JvmOSImpl;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "select c.* from `customer` c join`customer_type` ct " +
            "on c.customer_type_id= ct.id " +
            "where c.name like %:name% and c.email like %:email% and ct.name like %:type% and c.status=1", nativeQuery = true)
    Page<Customer> findByNameAndEmailAndCustomerType(@Param("name") String name,
                                                     @Param("email") String email,
                                                     @Param("type") String type, Pageable pageable);

    @Query(value = "select * from customer where `status`=1", nativeQuery = true)
    Page<Customer> findAll(Pageable pageable);

    @Query(value = "select c.* from `customer` c where c.`status`=1", nativeQuery = true)
    List<Customer> findAll();

    @Transactional
    @Modifying
    @Query(value = "update customer set `status`=0 where id=:id", nativeQuery = true)
    void remove(@Param("id") int id);

@Query(value = "select `customer`.* from `customer` join contract on `customer`.id= `contract`.customer_id" +
        " join `customer_type` on `customer`.customer_type_id= `customer_type`.id where `customer`.name like %:name% and `customer`.email like %:email%" +
        " and `customer_type`.name like %:typeName% and `customer`.status=1 group by `customer`.id",nativeQuery = true)
Page<Customer>findCustomerUsingService(@Param("name") String name,
                                       @Param("email") String email,
                                       @Param("typeName") String typeName,
                                       Pageable pageable);


}
