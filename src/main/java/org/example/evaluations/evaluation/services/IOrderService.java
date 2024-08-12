package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.Order;

public interface IOrderService {
    Order createOrder(Long customerId, Double totalAmount);
}