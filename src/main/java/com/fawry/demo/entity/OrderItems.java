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
public class OrderItems implements Serializable {
    private static final long serialVersionUID = 5892901861672274369L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long productId;
    @OneToOne
    private Product product;
    private Long quantity;
    private double totalAmount;
}