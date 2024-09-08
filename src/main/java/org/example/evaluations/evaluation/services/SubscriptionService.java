package org.example.evaluations.evaluation.services;

import com.razorpay.Subscription;
import org.example.evaluations.evaluation.clients.RazorpayPaymentGatewayClient;
import org.example.evaluations.evaluation.dtos.CreateSubscriptionRequest;
import org.example.evaluations.evaluation.dtos.RazorpayCustomerContactDetails;
import org.example.evaluations.evaluation.dtos.RazorpayPlanRequest;
import org.example.evaluations.evaluation.dtos.RazorpaySubscriptionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService implements ISubscriptionService {

    @Autowired
    private RazorpayPaymentGatewayClient razorpayPaymentGatewayClient;

    @Override
    public Subscription createSubscription(CreateSubscriptionRequest subscriptionRequest) {
        return razorpayPaymentGatewayClient.createSubscriptionLink(from(subscriptionRequest));
    }

    private RazorpaySubscriptionRequest from(CreateSubscriptionRequest createSubscriptionRequest) {
       RazorpaySubscriptionRequest razorpaySubscriptionRequest = new RazorpaySubscriptionRequest();
       razorpaySubscriptionRequest.setExpiryTime(createSubscriptionRequest.getEnding());
       razorpaySubscriptionRequest.setStartTime(createSubscriptionRequest.getStarting());
       razorpaySubscriptionRequest.setQuantity(createSubscriptionRequest.getChargeCount());
       razorpaySubscriptionRequest.setTotalCount(createSubscriptionRequest.getTotalNumberOfBillingCycles());

       RazorpayCustomerContactDetails razorpayCustomerContactDetails = new RazorpayCustomerContactDetails();
        razorpayCustomerContactDetails.setPhoneNumber(createSubscriptionRequest.getPhone());
        razorpayCustomerContactDetails.setEmail(createSubscriptionRequest.getEmail());
        razorpaySubscriptionRequest.setRazorpayCustomerContactDetails(razorpayCustomerContactDetails);

        RazorpayPlanRequest razorpayPlanRequest = new RazorpayPlanRequest();
        razorpayPlanRequest.setFrequency(createSubscriptionRequest.getPlanPeriod().name());
        razorpayPlanRequest.setName(createSubscriptionRequest.getPlanTitle());
        razorpayPlanRequest.setDescription(createSubscriptionRequest.getPlanDescription());
        razorpayPlanRequest.setAmount(createSubscriptionRequest.getPlanAmount());
        razorpaySubscriptionRequest.setRazorpayPlanRequest(razorpayPlanRequest);
        return razorpaySubscriptionRequest;
    }
}
