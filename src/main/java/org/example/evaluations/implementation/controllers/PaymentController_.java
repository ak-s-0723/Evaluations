package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.PaymentIntent_;
import org.example.evaluations.implementation.dtos.PaymentIntentRequestDto_;
import org.example.evaluations.implementation.services.IPaymentService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController_ {

    @Autowired
    private IPaymentService_ paymentService;

    @PostMapping("/paymentIntent_")
    public String createPaymentIntent(@RequestBody PaymentIntentRequestDto_ paymentIntentRequestDto) {
        return paymentService.createPaymentIntent(paymentIntentRequestDto.getAmount());
    }

    @GetMapping("/paymentIntent_")
    public List<PaymentIntent_> getPaymentIntents() {
        return paymentService.listPaymentIntents();
    }

    @PostMapping("/paymentIntent_/{id}")
    public Boolean cancelPaymentIntent(@PathVariable("id") String id) {
        return paymentService.cancelPaymentIntent(id);
    }
}
