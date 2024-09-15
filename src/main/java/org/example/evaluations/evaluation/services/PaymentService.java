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
        //Add your implementation here
        return null;
    }

    public List<PaymentIntent> listPaymentIntents() {
        //Add your implementation here
        return null;
    }

    public Boolean cancelPaymentIntent(String id) {
        //Add your implementation here
        return null;
    }
}
