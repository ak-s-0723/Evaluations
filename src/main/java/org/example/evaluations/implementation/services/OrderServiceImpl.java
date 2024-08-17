package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Order;
import org.example.evaluations.implementation.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Order getOrderById(Long orderId) {
       return orderRepo.findById(orderId);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }
}
