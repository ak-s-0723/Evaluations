package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Order;

public interface IOrderService {
    Order createOrder(Long customerId, Double totalAmount);
}