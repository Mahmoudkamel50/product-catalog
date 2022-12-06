package com.fawry.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductRequest implements Serializable {

    private static final long serialVersionUID = -7632974446345709370L;

    private Long id;
    private String nameEn;
    private String nameAr;
    private double price;
    private Long quantity;
    private Long buyingCounter;
    private byte[] image;
    private Long category_id;
}
