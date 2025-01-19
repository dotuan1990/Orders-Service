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

    @Override
    public double calculateTotalWithOffer(List<Product> products) {
        long appleCount = products.stream().filter(p -> p == Product.APPLE).count();
        long orangeCount = products.stream().filter(p -> p == Product.ORANGE).count();

        double appleCost = (((double) appleCount / 2) + (appleCount % 2)) * Product.APPLE.getPrice();
        double orangeCost = (((double) orangeCount / 3) * 2 + (orangeCount % 3)) * Product.ORANGE.getPrice();

        return appleCost + orangeCost;
    }

    @Override
    public Order createOrderWithOffer(Long id, List<Product> products) {
        double totalCost = calculateTotal(products);
        return new Order(id, products, totalCost);
    }
}
