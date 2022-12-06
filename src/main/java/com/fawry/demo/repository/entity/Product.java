package com.fawry.demo.repository.entity;

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
@Table(name = "PRODUCTS")
public class Product implements Serializable {
    private static final long serialVersionUID = -239601618523459077L;
    @Id
    @SequenceGenerator(sequenceName = "products_gen", allocationSize = 1, name = "products_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "products_gen")

    @Column(name = "ID")
    private Long id;
    @Column(name = "NAMEEN")
    private String nameEn;
    @Column(name = "NAMEAR")
    private String nameAr;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "BUYING_COUNTER")
    private Long buyingCounter;
    @Column(name = "IMAGE")
    private byte[] image;
    @Column(name = "CATEGORY_ID")
    private Long category_id;
}
