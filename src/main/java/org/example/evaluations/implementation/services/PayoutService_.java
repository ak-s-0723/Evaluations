package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.clients.RazorpayPaymentGatewayClient_;
import org.example.evaluations.implementation.dtos.PayoutPurpose_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayoutService_ implements IPayoutService_ {

    @Autowired
    private RazorpayPaymentGatewayClient_ razorpayPaymentGatewayClient;

    @Override
    public String createPayoutToBankAccount(String accountNumber, Double amount, PayoutPurpose_ purpose, String referenceId, String narration) {
        return razorpayPaymentGatewayClient.createPayoutToBankAccount(accountNumber,amount,purpose,referenceId,narration);
    }
}
