package org.example.evaluations.evaluation.clients;

import com.razorpay.RazorpayClient;
import com.razorpay.Subscription;
import org.example.evaluations.evaluation.dtos.RazorpaySubscriptionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class RazorpayPaymentGatewayClient {

    @Autowired
    private RazorpayClient razorpayClient;

    private final String offerId = "offer_JTUADI4ZWBGWur";  // Use this offerId wherever required

    public Subscription createSubscriptionLink(RazorpaySubscriptionRequest subscriptionInput) {
        //Add your implementation here
        return null;
    }
}
