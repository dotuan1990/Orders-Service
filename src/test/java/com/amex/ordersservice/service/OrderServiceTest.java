package com.amex.ordersservice.service;

import com.amex.ordersservice.model.Product;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {
    private final OrderService orderService = new OrderServiceImpl();

    @Test
    void calculateTotal_ShouldReturnCorrectSum() {
        double total = orderService.calculateTotal(Arrays.asList(Product.APPLE, Product.ORANGE, Product.APPLE));
        assertEquals(1.45, total);
    }

}
