package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderController {

    @Autowired
    private IOrderService orderService;

    //Please implement GET Api with path `/order/{orderId}` here
}
