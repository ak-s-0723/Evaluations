package org.example.evaluations.evaluation.services;

import org.springframework.stereotype.Service;

import java.net.URL;

@Service
public class PaymentService implements IPaymentService {

    @Override
    public String completePayment(String name, String phoneNumber, String email, Double amount, String description, String orderId, URL callback) {
       return null;
    }
}
