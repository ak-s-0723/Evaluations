package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.WebhookDto;
import org.example.evaluations.implementation.dtos.Webhook;
import org.example.evaluations.implementation.services.IWebhookService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook_")
public class WebhookController_ {

    @Autowired
    private IWebhookService_ webhookService;

    @PostMapping
    public Webhook createWebhook(@RequestBody WebhookDto createWebhookDto) {
        return  webhookService.createWebhook(createWebhookDto.getUrl(), createWebhookDto.getEvents());
    }

    @DeleteMapping("/{id}")
    public Boolean deleteWebhook(@PathVariable("id") String id) {
        return  webhookService.deleteWebhook(id);
    }

    @PatchMapping("/{id}")
    public Webhook updateWebhook(@RequestBody WebhookDto updateWebhookDto, @PathVariable("id") String id) {
        return webhookService.updateWebhook(updateWebhookDto.getUrl(), updateWebhookDto.getEvents(), id);
    }
}
