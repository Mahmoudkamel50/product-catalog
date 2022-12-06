package com.fawry.demo.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "ORDERS")
public class Order implements Serializable {

    private static final long serialVersionUID = 7973947875216180661L;
    @Id
    @SequenceGenerator(sequenceName = "order_gen", allocationSize = 1, name = "orders_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_gen")
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy ="order",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrderItem> orderItem;
    @Column(name = "TOTAL_AMOUNT")
    private double totalAmount;
}