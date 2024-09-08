package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.InitiatePaymentRequestDto_;
import org.example.evaluations.implementation.services.IPaymentService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController_ {

    @Autowired
    private IPaymentService_ paymentService;

    @PostMapping("/initiatePayment_")
    public String initiatePayment(@RequestBody InitiatePaymentRequestDto_ initiatePaymentRequestDto) {
        return paymentService.initiatePayment(initiatePaymentRequestDto.getName(),initiatePaymentRequestDto.getPhoneNumber(),initiatePaymentRequestDto.getEmail(),initiatePaymentRequestDto.getAmount(),initiatePaymentRequestDto.getDescription());
    }
}
