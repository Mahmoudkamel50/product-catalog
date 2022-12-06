package com.fawry.demo.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "ORDER_ITEMS")
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 5892901861672274369L;
    @Id
    @SequenceGenerator(sequenceName = "order_items_gen", allocationSize = 1, name = "order_items_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_items_gen")

    @Column(name = "ID")
    private Long id;

    @OneToOne(targetEntity = Product.class, fetch=FetchType.EAGER )
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(targetEntity = Order.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "PRICE")
    private double price;
}
