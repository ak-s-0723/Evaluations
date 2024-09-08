package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.CompletePaymentDto_;
import org.example.evaluations.implementation.services.IPaymentService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController_ {

    @Autowired
    private IPaymentService_ paymentService;

    @PostMapping("/completePayment_")
    public String completePayment(@RequestBody CompletePaymentDto_ completePaymentDto) {
        return  paymentService.completePayment(completePaymentDto.getName(),completePaymentDto.getPhoneNumber(),completePaymentDto.getEmail(), completePaymentDto.getAmount(), completePaymentDto.getDescription(),completePaymentDto.getOrderId(),completePaymentDto.getCallback());
    }
}
