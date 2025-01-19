package com.amex.ordersservice.service;

import com.amex.ordersservice.model.Order;
import com.amex.ordersservice.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    double calculateTotal(List<Product> products);
    Order createOrder(Long id, List<Product> products);

    double calculateTotalWithOffer(List<Product> products);
    Order createOrderWithOffer(Long id, List<Product> products);
}
