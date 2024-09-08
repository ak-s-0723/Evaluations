package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.clients.RazorpayPaymentGatewayClient_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;

@Service
public class PaymentService_ implements IPaymentService_ {

    @Autowired
    private RazorpayPaymentGatewayClient_ razorpayPaymentGatewayClient;

    @Override
    public String completePayment(String name, String phoneNumber, String email, Double amount, String description, String orderId, URL callback) {
        return razorpayPaymentGatewayClient.completePaymentAndOpenCallBack(name, phoneNumber, email, amount, description, orderId,callback);
    }
}
