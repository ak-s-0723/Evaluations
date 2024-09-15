package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.clients.StripePaymentGateway_;
import org.example.evaluations.implementation.dtos.Webhook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WebhookService_ implements IWebhookService_ {

    @Autowired
    private StripePaymentGateway_ stripePaymentGateway;

    public Webhook createWebhook(String url, List<String> events) {
        return stripePaymentGateway.createWebhook(url,events);
    }

    public Boolean deleteWebhook(String webhookId) {
        return stripePaymentGateway.deleteWebhook(webhookId);
    }

    public Webhook updateWebhook(String updatedUrl, List<String> events, String webhookId) {
        return stripePaymentGateway.updateWebhook(updatedUrl, events, webhookId);
    }
}
