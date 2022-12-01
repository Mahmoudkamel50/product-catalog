package com.fawry.demo.service;

import com.fawry.demo.dto.OrderDTO;
import com.fawry.demo.dto.ResponseOrderDTO;
import com.fawry.demo.entity.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    Order getOrderDetail(Long orderId);
    ResponseOrderDTO placeOrder(OrderDTO orderDTO);
    Order mapOrderDtoToOrder(OrderDTO orderDTO);
    ResponseOrderDTO buildResponseOrderDto(Order order);
}
