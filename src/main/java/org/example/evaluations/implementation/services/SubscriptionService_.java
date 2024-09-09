package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.clients.RazorpayPaymentGatewayClient_;
import org.example.evaluations.implementation.dtos.CreateSubscriptionRequest_;
import org.example.evaluations.implementation.utils.SubscriptionRequestConverter_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService_ implements ISubscriptionService_ {

    @Autowired
    private RazorpayPaymentGatewayClient_ razorpayPaymentGatewayClient;

    @Autowired
    private SubscriptionRequestConverter_ requestConverter;

    @Override
    public String createSubscription(CreateSubscriptionRequest_ subscriptionRequest) {
        return razorpayPaymentGatewayClient.createSubscriptionLink(requestConverter.from(subscriptionRequest)).get("short_url").toString();
    }
}
