package com.codegym.repository.customer;

import com.codegym.model.customer.Customer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "select customer.* from `customer` join `customer_type` on `customer`.customer_type_id= `customer_type`.id where `customer`.name like %:name%" +
            " and `customer`.email like %:email% and `customer_type`.name like %:type% and `customer`.status=1", nativeQuery = true)
    Page<Customer> findByNameAndEmailAndCustomerType(@Param("name") String name,
                                                     @Param("email") String email,
                                                     @Param("type") String type, Pageable pageable);




    @Transactional
    @Modifying
    @Query(value = "update customer set status =0 where id=:id", nativeQuery = true)
    void remove(@Param("id") int id);

}
