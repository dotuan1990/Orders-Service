package com.amex.ordersservice.controller;

import com.amex.ordersservice.model.Order;
import com.amex.ordersservice.model.Product;
import com.amex.ordersservice.repository.OrderRepository;
import com.amex.ordersservice.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    private static Long currentOrderId = 1L;

    @PostMapping
    public Order createOrder(@RequestBody List<Product> products) {
        Order order = orderService.createOrder(currentOrderId, products);
        orderRepository.save(order);
        currentOrderId++;
        return order;
    }
    @PostMapping("/with-offer")
    public Order createOrderWithOffer(@RequestBody List<Product> products) {
        Order order = orderService.createOrderWithOffer(currentOrderId, products);
        orderRepository.save(order);
        currentOrderId++;
        return order;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
