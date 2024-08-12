package org.example.evaluations.implementation.repositories;

import org.example.evaluations.implementation.models.Order;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class OrderRepo {
    private Map<UUID, Order> orders;

    public OrderRepo() {
        orders = new HashMap<>();
    }

    public Order save(Order order) {
        orders.put(order.getId(),order);
        return orders.get(order.getId());
    }
}