package org.example.evaluations.implementation.services;

import com.stripe.param.PlanCreateParams;
import org.example.evaluations.implementation.clients.StripePaymentGateway_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SubscriptionService_ implements ISubscriptionService_ {

    @Autowired
    private StripePaymentGateway_ stripePaymentGateway;

    public String createSubscriptionForProduct(String customerName,String customerEmail,Long productAmount, String productName, PlanCreateParams.Interval interval) {
        return stripePaymentGateway.createSubscriptionForProduct(customerName, customerEmail, productAmount, productName, interval);
    }
}
