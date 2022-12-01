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
@Table(name = "ORDER_ITEMS", schema = "HR")
public class OrderItems implements Serializable {
    private static final long serialVersionUID = 5892901861672274369L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ITEMS_ID")
    private Long orderItemsId;
    @Column(name = "PRODUCT_ID")
    private Long productId;
    @OneToOne(targetEntity = Product.class, fetch=FetchType.EAGER )
    private Product product;
    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "TOTAL_AMOUNT")
    private double totalAmount;
}
