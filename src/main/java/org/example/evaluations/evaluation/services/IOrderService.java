package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.Order;

public interface IOrderService {
    Order getOrderById(Long orderId);
}
