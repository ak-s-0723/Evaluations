package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.clients.StripePaymentGateway_;
import org.example.evaluations.implementation.dtos.PaymentIntent_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService_ implements IPaymentService_ {

    @Autowired
    private StripePaymentGateway_ stripePaymentGateway;

    public String createPaymentIntent(Long amount){
        return stripePaymentGateway.createPaymentIntent(amount);
    }

    public List<PaymentIntent_> listPaymentIntents() {
        return stripePaymentGateway.listPaymentIntents();
    }

    public Boolean cancelPaymentIntent(String id) {
        return stripePaymentGateway.cancelPaymentIntent(id);
    }
}
