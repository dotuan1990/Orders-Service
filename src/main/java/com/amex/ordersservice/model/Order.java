package com.amex.ordersservice.model;

import java.util.List;

public class Order {
    private Long id;
    private List<Product> products;
    private double totalCost;

    public Order(Long id, List<Product> products, double totalCost) {
        this.id = id;
        this.products = products;
        this.totalCost = totalCost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
