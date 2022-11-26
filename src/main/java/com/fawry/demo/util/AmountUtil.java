package com.fawry.demo.util;

import com.fawry.demo.entity.OrderItems;

import java.util.List;

public class AmountUtil {
    public static double getTotalAmount(List<OrderItems> orderItems) {

        return orderItems.stream()
                .mapToDouble(OrderItems::getTotalAmount)
                .sum();
    }
}
