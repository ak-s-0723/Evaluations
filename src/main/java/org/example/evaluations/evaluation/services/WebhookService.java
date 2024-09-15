package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.clients.StripePaymentGateway;
import org.example.evaluations.evaluation.dtos.Webhook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WebhookService implements IWebhookService {

    @Autowired
    private StripePaymentGateway stripePaymentGateway;

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
