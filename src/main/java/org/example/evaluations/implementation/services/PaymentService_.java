package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.clients.StripePaymentGateway_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService_ implements IPaymentService_ {

    @Autowired
    private StripePaymentGateway_ stripePaymentGateway;

    public String getPaymentLink(Long amount, Long quantity, String callbackUrl, String productName) {
        return stripePaymentGateway.getPaymentLink(amount,quantity,callbackUrl,productName);
    }
}
