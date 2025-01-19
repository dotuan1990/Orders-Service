package com.amex.ordersservice.model;

public enum Product {
    APPLE(0.60),
    ORANGE(0.25);

    private final double price;

    Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
