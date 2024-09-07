package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.exceptions.OrderNotFoundException_;

public interface IOrderService_ {
    Boolean cancelOrder(Long orderId) throws OrderNotFoundException_;
}
