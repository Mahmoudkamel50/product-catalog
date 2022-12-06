package com.fawry.demo.model.response;

import lombok.Data;

@Data
public class ResponseOrderDTO {

    private double amount;
    private String date;
    private Long orderId;
}