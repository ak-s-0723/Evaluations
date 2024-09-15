package org.example.evaluations.evaluation.clients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StripePaymentGateway {

    @Value("${stripe.key}")
    public String apiKey;

    public String createPaymentIntent(Long amount) {
        //Add your implementation here
        return null;
    }

    public List<org.example.evaluations.evaluation.dtos.PaymentIntent> listPaymentIntents() {
        //Add your implementation here
        return null;
    }

    public Boolean cancelPaymentIntent(String id) {
        //Add your implementation here
        return null;
    }
}
