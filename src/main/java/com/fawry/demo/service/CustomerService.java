package com.fawry.demo.service;

import com.fawry.demo.repository.entity.Customer;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    UserDetails loadUserByUsername(String email);
    String signUpUser(Customer customer);
    Long enableCustomer(String email);
}
