package com.mappings.service;

import com.mappings.entity.Customer;
import com.mappings.entity.Order;
import com.mappings.repository.CustomerRepository;
import com.mappings.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private CustomerRepository customerRepository;

    public OrderService(OrderRepository orderRepository, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
    }

    public Order addOrder(Long orderId, Order order) {
        Customer customer = customerRepository.findById(orderId).get();
        order.setCustomer(customer);
        Order savedOrder = orderRepository.save(order);
        return savedOrder;
    }
}
