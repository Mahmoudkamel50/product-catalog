package com.fawry.demo.dto;

import com.fawry.demo.entity.OrderItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO implements Serializable {

    private static final long serialVersionUID = 5393403638138288027L;

    private String orderDescription;
    private List<OrderItems> orderItems;
    private String customerEmail;
    private String customerName;

}