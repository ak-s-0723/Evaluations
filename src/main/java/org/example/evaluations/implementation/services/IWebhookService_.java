package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.dtos.Webhook;

import java.util.List;


public interface IWebhookService_ {
    Webhook createWebhook(String url, List<String> events);
    Boolean deleteWebhook(String webhookId);
    Webhook updateWebhook(String updatedUrl, List<String> events, String webhookId);
}
