package org.example.evaluations.evaluation.clients;

import org.example.evaluations.evaluation.dtos.Webhook;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StripePaymentGateway {

    @Value("${stripe.key}")
    public String apiKey;

    public Webhook createWebhook(String url, List<String> events) {
        //Add your implementation here
        return null;
    }

    public Boolean deleteWebhook(String webhookId) {
        //Add your implementation here
        return null;
    }


    public Webhook updateWebhook(String updatedUrl, List<String> events, String webhookId) {
        //Add your implementation here
        return null;
    }

}
