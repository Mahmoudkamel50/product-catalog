package com.fawry.demo.service;

import com.fawry.demo.model.OrderRequest;
import com.fawry.demo.model.response.ResponseOrderDTO;
import com.fawry.demo.repository.entity.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    Order getOrderDetail(Long orderId);
    ResponseOrderDTO placeOrder(OrderRequest orderRequest);
    Order mapOrderDtoToOrder(OrderRequest orderRequest);
    ResponseOrderDTO buildResponseOrderDto(Order order);
}
