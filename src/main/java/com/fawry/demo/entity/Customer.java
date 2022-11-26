package com.fawry.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = -7168715675685919727L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "email")
    private String email;

}