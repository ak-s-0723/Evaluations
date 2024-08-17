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

    public void save(Order order) {
        orders.put(order.getId(),order);
    }

    public Boolean remove(UUID orderId) {
        Order order = orders.remove(orderId);
        if(order != null) return true;
        else return false;
    }
}