package com.fawry.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = 7973947875216180661L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String orderDescription;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = OrderItems.class)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private List<OrderItems> orderItems;

    private double totalAmount;

}