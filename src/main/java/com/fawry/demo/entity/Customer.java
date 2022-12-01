package com.fawry.demo.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "CUSTOMER", schema = "HR")
public class Customer implements Serializable {

    private static final long serialVersionUID = -7168715675685919727L;
    @Id
    @SequenceGenerator(sequenceName = "customer_gen",
            allocationSize = 1,
            name = "hr.customer_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "customer_gen")

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "EMAIL")
    private String email;

}