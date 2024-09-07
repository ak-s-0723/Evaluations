package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.CancelOrderRequestDto_;
import org.example.evaluations.implementation.exceptions.OrderNotFoundException_;
import org.example.evaluations.implementation.services.IOrderService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order_")
public class OrderController_ {

    @Autowired
    private IOrderService_ orderService;

    @DeleteMapping
    public Boolean cancelOrder(@RequestBody CancelOrderRequestDto_ cancelOrderRequestDto) throws  OrderNotFoundException_ {
        try {
            return orderService.cancelOrder(cancelOrderRequestDto.getOrderId());
        }catch (OrderNotFoundException_ orderNotFoundException) {
            throw orderNotFoundException;
        }
    }

    @ExceptionHandler(OrderNotFoundException_.class)
    public ResponseEntity<String> throwExceptions(Exception e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
