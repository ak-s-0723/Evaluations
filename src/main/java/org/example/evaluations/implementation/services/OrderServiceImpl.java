package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Order;
import org.example.evaluations.implementation.models.OrderStatus;
import org.example.evaluations.implementation.repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public Order createOrder(Long customerId, Double totalAmount) {
        Order order = new Order();
        order.setCustomerId(customerId);
        order.setTotalAmount(totalAmount);
        order.setStatus(OrderStatus.CREATED);
        order.setId(UUID.randomUUID());
        order.setCreatedAt(new Date());
        order.setLastUpdatedAt(new Date());
        orderRepo.save(order);
        return order;
    }

    @Override
    public Boolean deleteOrder(UUID orderId) {
        return orderRepo.remove(orderId);
    }
}