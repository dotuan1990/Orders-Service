package com.amex.ordersservice.service;

import com.amex.ordersservice.model.Order;
import com.amex.ordersservice.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    public double calculateTotal(List<Product> products);
    public Order createOrder(Long id, List<Product> products);
}
