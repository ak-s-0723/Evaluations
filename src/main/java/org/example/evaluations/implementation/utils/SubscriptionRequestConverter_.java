package org.example.evaluations.implementation.utils;

import org.example.evaluations.implementation.dtos.CreateSubscriptionRequest_;
import org.example.evaluations.implementation.dtos.RazorpayCustomerContactDetails_;
import org.example.evaluations.implementation.dtos.RazorpayPlanRequest_;
import org.example.evaluations.implementation.dtos.RazorpaySubscriptionRequest_;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionRequestConverter_ {
    public RazorpaySubscriptionRequest_ from(CreateSubscriptionRequest_ createSubscriptionRequest) {
        RazorpaySubscriptionRequest_ razorpaySubscriptionRequest = new RazorpaySubscriptionRequest_();
        razorpaySubscriptionRequest.setExpiryTime(createSubscriptionRequest.getEnding());
        razorpaySubscriptionRequest.setStartTime(createSubscriptionRequest.getStarting());
        razorpaySubscriptionRequest.setQuantity(createSubscriptionRequest.getChargeCount());
        razorpaySubscriptionRequest.setTotalCount(createSubscriptionRequest.getTotalNumberOfBillingCycles());

        RazorpayCustomerContactDetails_ razorpayCustomerContactDetails = new RazorpayCustomerContactDetails_();
        razorpayCustomerContactDetails.setPhoneNumber(createSubscriptionRequest.getPhone());
        razorpayCustomerContactDetails.setEmail(createSubscriptionRequest.getEmail());
        razorpaySubscriptionRequest.setRazorpayCustomerContactDetails(razorpayCustomerContactDetails);

        RazorpayPlanRequest_ razorpayPlanRequest = new RazorpayPlanRequest_();
        razorpayPlanRequest.setFrequency(createSubscriptionRequest.getPlanPeriod().name());
        razorpayPlanRequest.setName(createSubscriptionRequest.getPlanTitle());
        razorpayPlanRequest.setDescription(createSubscriptionRequest.getPlanDescription());
        razorpayPlanRequest.setAmount(createSubscriptionRequest.getPlanAmount());
        razorpaySubscriptionRequest.setRazorpayPlanRequest(razorpayPlanRequest);
        return razorpaySubscriptionRequest;
    }
}
