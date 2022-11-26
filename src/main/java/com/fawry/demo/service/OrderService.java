package com.fawry.demo.service;

import com.fawry.demo.dto.OrderDTO;
import com.fawry.demo.dto.ResponseOrderDTO;
import com.fawry.demo.entity.Customer;
import com.fawry.demo.entity.Order;
import com.fawry.demo.repository.CustomerRepository;
import com.fawry.demo.repository.OrderRepository;
import com.fawry.demo.util.AmountUtil;
import com.fawry.demo.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductService productService;
    @Autowired
    private CustomerRepository customerRepository;


    public Order getOrderDetail(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    public ResponseOrderDTO placeOrder(OrderDTO orderDTO) {

        orderDTO.getOrderItems().forEach(
                item ->
                    productService.updateProductQuantity(item.getProductId(), item.getQuantity())
                );
        Order order = mapOrderDtoToOrder(orderDTO);
        order.setTotalAmount(AmountUtil.getTotalAmount(order.getOrderItems()));
        orderRepository.save(order);
        return buildResponseOrderDto(order);
    }

    private Order mapOrderDtoToOrder(OrderDTO orderDTO) {
        Customer customer= customerRepository.findByEmail(orderDTO.getCustomerEmail());
        Order order = new Order();
        order.setCustomer(customer);
        order.getOrderItems()
                .addAll(orderDTO.getOrderItems());
        return order;
    }

    private ResponseOrderDTO buildResponseOrderDto(Order order) {
        ResponseOrderDTO orderDTO = new ResponseOrderDTO();
        orderDTO.setAmount(order.getTotalAmount());
        orderDTO.setDate(DateUtil.getCurrentDateTime());
        return orderDTO;
    }
}