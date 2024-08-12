package org.example.evaluations.evaluation.repositories;

import org.example.evaluations.evaluation.models.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {
    private Map<Long, Order> orders;

    public OrderRepository() {
        orders = new HashMap<>();
    }

    public Order findById(Long orderId) {
        //Please add logic for getting Order corresponding to particular
        // orderId from HashMap where orderId is stored as key and Order is stored
        //value in HashMap

        return null;
    }

    //Please don't delete below function
    public Order save(Order order) {
        orders.put(order.getId(),order);
        return orders.get(order.getId());
    }
}
