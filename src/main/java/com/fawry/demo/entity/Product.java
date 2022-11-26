package com.fawry.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product implements Serializable {
    private static final long serialVersionUID = -239601618523459077L;
    @Id
    @SequenceGenerator(sequenceName = "product_sequence",
                       allocationSize = 1,
                       name = "product_sequence")

    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "product_sequence")
    @Column(name = "product_id", nullable = false, updatable = false)
    private Long productId;

    @Column(name = "nameEn", nullable = false, length = 128)
    private String nameEn;

    @Column(name = "nameAr", nullable = false, length = 128)
    private String nameAr;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private double price;

    @Column(name = "quantity", nullable = false,length = 10)
    private Long quantity;

    @Column(name = "image")
    private String image;

}
