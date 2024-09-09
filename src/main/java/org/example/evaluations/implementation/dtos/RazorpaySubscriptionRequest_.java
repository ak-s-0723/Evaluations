package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RazorpaySubscriptionRequest_ {
    Long quantity;
    Long totalCount;
    Long startTime;
    Long expiryTime;
    RazorpayCustomerContactDetails_ razorpayCustomerContactDetails;
    RazorpayPlanRequest_ razorpayPlanRequest;
}
