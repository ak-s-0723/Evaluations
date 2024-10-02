package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.dtos.PaymentIntent;
import org.example.evaluations.evaluation.dtos.PaymentIntentRequestDto;
import org.example.evaluations.evaluation.services.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @PostMapping("/paymentIntent")
    public String createPaymentIntent(@RequestBody PaymentIntentRequestDto paymentIntentRequestDto) {
        return paymentService.createPaymentIntent(paymentIntentRequestDto.getAmount());
    }

    @GetMapping("/paymentIntent")
    public List<PaymentIntent> getPaymentIntents() {
        return paymentService.listPaymentIntents();
    }

    @PostMapping("/paymentIntent/{id}")
    public Boolean cancelPaymentIntent(@PathVariable("id") String id) {
        return paymentService.cancelPaymentIntent(id);
    }
}
