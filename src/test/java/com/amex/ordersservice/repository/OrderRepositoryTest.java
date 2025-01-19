package com.amex.ordersservice.repository;

import com.amex.ordersservice.model.Order;
import com.amex.ordersservice.model.Product;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderRepositoryTest {
    private final OrderRepository repository = new OrderRepository();

    @Test
    void shouldStoreAndRetrieveOrders() {
        Order order = new Order(1L, Arrays.asList(Product.APPLE, Product.ORANGE), 0.85);
        repository.save(order);

        assertEquals(order, repository.findById(1L).orElse(null));
        assertEquals(1, repository.findAll().size());
    }

}
