package org.example.evaluations.evaluation.clients;

import org.example.evaluations.evaluation.dtos.PayoutPurpose;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RazorpayPaymentGatewayClient {

    @Value("${razorpay.id}")
    private String razorpayKeyId;

    @Value("${razorpay.secret}")
    private String razorpayKeySecret;

    private final String path = "https://api.razorpay.com/v1/payouts";

    public String createPayoutToBankAccount(String accountNumber, Double amount, PayoutPurpose purpose, String referenceId, String narration) {
        //Add your implementation here
        return null;
    }
}
