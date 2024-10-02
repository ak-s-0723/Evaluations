package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.clients.StripePaymentGateway;
import org.example.evaluations.evaluation.dtos.PaymentIntent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService implements IPaymentService {

    @Autowired
    private StripePaymentGateway stripePaymentGateway;

    public String createPaymentIntent(Long amount){
        return stripePaymentGateway.createPaymentIntent(amount);
    }

    public List<PaymentIntent> listPaymentIntents() {
        return stripePaymentGateway.listPaymentIntents();
    }

    public Boolean cancelPaymentIntent(String id) {
        return stripePaymentGateway.cancelPaymentIntent(id);
    }
}
