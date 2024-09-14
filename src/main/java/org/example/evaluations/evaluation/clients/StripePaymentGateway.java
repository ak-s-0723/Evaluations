package org.example.evaluations.evaluation.clients;

import org.example.evaluations.evaluation.dtos.SessionDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StripePaymentGateway {

    @Value("${stripe.key}")
    public String apiKey;

    public SessionDto createSession(String successUrl, List<Long> amounts, List<String> productNames, List<Long> quantities) {
        //Add your implementation here
        return null;
    }
}
