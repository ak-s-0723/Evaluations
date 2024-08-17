package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Order;

import java.util.UUID;

public interface IOrderService {
    Order createOrder(Long customerId, Double totalAmount);

    Boolean deleteOrder(UUID orderId);
}