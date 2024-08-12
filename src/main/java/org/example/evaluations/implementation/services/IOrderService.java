package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Order;

public interface IOrderService {
    Order getOrderById(Long orderId);
}
