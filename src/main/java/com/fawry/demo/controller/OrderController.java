package com.fawry.demo.controller;

import com.fawry.demo.dto.OrderDTO;
import com.fawry.demo.dto.ResponseOrderDTO;
import com.fawry.demo.entity.Order;
import com.fawry.demo.service.OrderServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("orders")
public class OrderController {
    @Autowired
    private OrderServiceImplementation orderServiceImplementation;

    @GetMapping(value = "{orderId}")
    public ResponseEntity<Order> getOrderDetails(@PathVariable Long orderId) {
        Order order = orderServiceImplementation.getOrderDetail(orderId);
        return ResponseEntity.ok(order);
    }

    @PostMapping("/placeOrder")
    public ResponseEntity<ResponseOrderDTO> placeOrder(@RequestBody OrderDTO orderDTO) {
        ResponseOrderDTO responseOrderDTO = orderServiceImplementation.placeOrder(orderDTO);
        return ResponseEntity.ok(responseOrderDTO);
    }
}
