package com.amex.ordersservice.model;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Order {
    private Long id;
    private List<Product> products;
    private double totalCost;
}
