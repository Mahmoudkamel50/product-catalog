package com.fawry.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "ORDERS", schema = "HR")
public class Order implements Serializable {

    private static final long serialVersionUID = 7973947875216180661L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ID")
    private int orderId;

    @Column(name = "ORDER_DESCRIPTION")
    private String orderDescription;

    @OneToOne(targetEntity = Customer.class ,cascade = CascadeType.MERGE)
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = OrderItems.class)
    @JoinColumn(name = "ORDER_ITEMS_ID")
    private List<OrderItems> orderItems;
    @Column(name = "TOTAL_AMOUNT")
    private double totalAmount;

}