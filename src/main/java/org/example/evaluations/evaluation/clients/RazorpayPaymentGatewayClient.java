package org.example.evaluations.evaluation.clients;

import org.springframework.stereotype.Component;

import java.net.URL;

@Component
public class RazorpayPaymentGatewayClient {

    public String completePaymentAndOpenCallBack(String name, String phoneNumber, String email, Double amount, String description, String orderId,URL callback) {
        return null;
    }
}
