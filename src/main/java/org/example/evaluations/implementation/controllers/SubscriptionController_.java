package org.example.evaluations.implementation.controllers;

import com.stripe.param.PlanCreateParams;
import org.example.evaluations.implementation.dtos.SubscriptionRequestDto_;
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
    public String createSubscription(@RequestBody SubscriptionRequestDto_ subscriptionRequestDto) {
        PlanCreateParams.Interval interval =
                PlanCreateParams.Interval.valueOf(subscriptionRequestDto.getBillingFrequency().name());

        return subscriptionService
          .createSubscriptionForProduct(subscriptionRequestDto.getCustomerName(),subscriptionRequestDto.getCustomerEmail(),subscriptionRequestDto.getProductAmount(),subscriptionRequestDto.getProductName(),interval);
    }
}
