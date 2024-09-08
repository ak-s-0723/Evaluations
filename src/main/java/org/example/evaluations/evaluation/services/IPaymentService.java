package org.example.evaluations.evaluation.services;

import com.razorpay.Subscription;
import org.example.evaluations.evaluation.dtos.CreateSubscriptionRequest;

public interface IPaymentService {
    Subscription createSubscription(CreateSubscriptionRequest subscriptionRequest);
}
