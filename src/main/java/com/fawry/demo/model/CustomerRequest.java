package com.fawry.demo.model;

import com.fawry.demo.repository.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerRequest implements Serializable {

    private static final long serialVersionUID = 7482855729017152312L;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone ;
    private List<Order> orderList;
}
