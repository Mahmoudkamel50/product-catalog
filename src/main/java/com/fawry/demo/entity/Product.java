package com.fawry.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRODUCTS", schema = "HR")
public class Product implements Serializable {
    private static final long serialVersionUID = -239601618523459077L;
    @Id
    @SequenceGenerator(sequenceName = "products_gen",
                       allocationSize = 1,
                       name = "hr.products_seq")

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "products_gen")
    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "NAMEEN")
    private String nameEn;

    @Column(name = "NAMEAR")
    private String nameAr;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "QUANTITY")
    private Long quantity;

    @Column(name = "BUYING_COUNTER")
    private int buyingCounter;

    @Column(name = "IMAGE")
    private byte[] image;
}
