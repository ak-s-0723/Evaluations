package org.example.evaluations.implementation.services;

import com.stripe.param.PlanCreateParams;


public interface ISubscriptionService_ {
    String createSubscriptionForProduct(String customerName,String customerEmail,Long productAmount, String productName, PlanCreateParams.Interval interval);
}
