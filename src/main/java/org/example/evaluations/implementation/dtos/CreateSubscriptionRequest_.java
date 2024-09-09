package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateSubscriptionRequest_ {
    Long chargeCount;
    Long totalNumberOfBillingCycles;
    Long starting;
    Long ending;
    String phone;
    String email;
    Period_ planPeriod;
    String planTitle;
    String planDescription;
    Double planAmount;
}
