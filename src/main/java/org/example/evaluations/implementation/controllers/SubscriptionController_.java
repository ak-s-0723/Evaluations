package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.CreateSubscriptionRequest_;
import org.example.evaluations.implementation.services.ISubscriptionService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController_ {

    @Autowired
    private ISubscriptionService_ subscriptionService;

    @PostMapping("/subscription_")
    public String createSubscription(@RequestBody CreateSubscriptionRequest_ subscriptionRequest) {
        return subscriptionService.createSubscription(subscriptionRequest);
    }
}
