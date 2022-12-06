package com.fawry.demo.repository;

import com.fawry.demo.repository.entity.Customer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    Optional <Customer> findByEmail(String email);

    @Transactional
    @Modifying
    @Query("UPDATE Customer a " +
            "SET a.enabled = TRUE WHERE a.email = ?1")

    Long enableCustomer(String email);
}
