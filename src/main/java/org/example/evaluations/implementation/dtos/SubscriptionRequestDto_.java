package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SubscriptionRequestDto_ {
    String customerName;
    String customerEmail;
    Long productAmount;
    String productName;
    BillingFrequency_ billingFrequency;
}
