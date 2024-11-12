package com.mappings.controller;

import com.mappings.entity.Order;
import com.mappings.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<String> addOrder(@RequestParam Long orderId, @RequestBody Order order){
        Order savedOrder = orderService.addOrder(orderId, order);
        return new ResponseEntity<>("Order Saved", HttpStatus.CREATED);
    }
}
