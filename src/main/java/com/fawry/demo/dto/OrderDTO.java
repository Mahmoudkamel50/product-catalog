package com.fawry.demo.dto;

import com.fawry.demo.entity.OrderItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private String orderDescription;
    private List<OrderItems> orderItems;
    private String customerEmail;
    private String customerName;

}