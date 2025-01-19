package com.amex.ordersservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Order {
    private Long id;
    private List<Product> products;
    private double totalCost;
}
