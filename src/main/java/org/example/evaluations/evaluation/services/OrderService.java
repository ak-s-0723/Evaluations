package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.Order;
import org.example.evaluations.evaluation.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class OrderService implements IOrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order createOrder(Long customerId, Double totalAmount) {
        //Add your implementation here
        return null;
    }

    @Override
    public Boolean deleteOrder(UUID orderId) {
      //Add your implementation here and return result rather than returning false
      return false;
    }
}