package com.fawry.demo.dto;

import lombok.Data;

@Data
public class ResponseOrderDTO {

    private double amount;
    private String date;
    private String orderDescription;
    private Long orderId;
}