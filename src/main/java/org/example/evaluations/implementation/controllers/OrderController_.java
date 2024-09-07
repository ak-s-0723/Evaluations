package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.CreateOrderRequestDto_;
import org.example.evaluations.implementation.exceptions.ShortInventoryException_;
import org.example.evaluations.implementation.models.Order_;
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

    @PostMapping
    public Order_ createOrder(@RequestBody CreateOrderRequestDto_ createOrderRequestDto) throws ShortInventoryException_ {
        try {
            return orderService.createOrder(createOrderRequestDto.getItemQuantityMap(), createOrderRequestDto.getCustomerId());
        }catch (ShortInventoryException_ exception) {
            throw exception;
        }
    }

    @ExceptionHandler(ShortInventoryException_.class)
    public ResponseEntity<String> throwExceptions(Exception e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
