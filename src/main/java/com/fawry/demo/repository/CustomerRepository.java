package com.fawry.demo.repository;

import com.fawry.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

     Customer findByEmail(String email);
}
