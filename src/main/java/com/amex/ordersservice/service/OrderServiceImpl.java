package com.amex.ordersservice.service;

import com.amex.ordersservice.model.Order;
import com.amex.ordersservice.model.Product;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    @Override
    public double calculateTotal(List<Product> products) {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public Order createOrder(Long id, List<Product> products) {
        double totalCost = calculateTotal(products);
        return new Order(id, products, totalCost);
    }
}
