package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.OrderRequestDto;
import org.example.evaluations.implementation.models.Order;
import org.example.evaluations.implementation.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody OrderRequestDto orderRequestDto) {
      return orderService.createOrder(orderRequestDto.getCustomerId(),orderRequestDto.getTotalAmount());
    }
}