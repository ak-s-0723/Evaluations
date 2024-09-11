package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.InitializePaymentRequestDto_;
import org.example.evaluations.implementation.services.IPaymentService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController_ {

    @Autowired
    private IPaymentService_ paymentService;

    @PostMapping("/payment_")
    public String initializePayment(@RequestBody InitializePaymentRequestDto_ initializePaymentRequestDto) {
        return paymentService.getPaymentLink(initializePaymentRequestDto.getAmount(), initializePaymentRequestDto.getQuantity(), initializePaymentRequestDto.getCallbackUrl(), initializePaymentRequestDto.getProductName());
    }
}
