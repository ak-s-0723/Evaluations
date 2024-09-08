package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.clients.RazorpayPaymentGatewayClient_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService_ implements IPaymentService_ {

    @Autowired
    private RazorpayPaymentGatewayClient_ razorpayPaymentGatewayClient;

    @Override
    public String initiatePayment(String name, String phoneNumber, String email, Double amount,String description) {
        return razorpayPaymentGatewayClient.initiatePayment(name,phoneNumber,email,amount,description);
    }
}
