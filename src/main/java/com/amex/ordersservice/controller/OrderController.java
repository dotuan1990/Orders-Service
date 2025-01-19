package com.amex.ordersservice.controller;

import com.amex.ordersservice.model.Order;
import com.amex.ordersservice.model.Product;
import com.amex.ordersservice.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private static Long currentOrderId = 1L;

    @PostMapping
    public Order createOrder(@RequestBody List<Product> products) {
        Order order = orderService.createOrder(currentOrderId, products);
        currentOrderId++;
        return order;
    }
}
