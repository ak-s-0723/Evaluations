package org.example.evaluations.implementation.services;

import java.net.URL;

public interface IPaymentService_ {
    String completePayment(String name, String phoneNumber, String email, Double amount, String description, String orderId, URL callback);
}
