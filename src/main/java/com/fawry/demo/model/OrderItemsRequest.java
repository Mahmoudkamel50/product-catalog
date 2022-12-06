package com.fawry.demo.model;

import com.fawry.demo.repository.entity.Order;
import com.fawry.demo.repository.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemsRequest {

    private Product product;
    private Order order;
    private Long quantity;
    private double price;
}
