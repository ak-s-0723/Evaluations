package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Order;

import java.util.List;

public interface IOrderService {
    Order getOrderById(Long orderId);

    List<Order> getAllOrders();
}
