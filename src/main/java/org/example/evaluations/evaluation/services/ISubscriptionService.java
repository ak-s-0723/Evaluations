package org.example.evaluations.evaluation.services;

import com.razorpay.Subscription;
import org.example.evaluations.evaluation.dtos.CreateSubscriptionRequest;

public interface ISubscriptionService {
    Subscription createSubscription(CreateSubscriptionRequest subscriptionRequest);
}
