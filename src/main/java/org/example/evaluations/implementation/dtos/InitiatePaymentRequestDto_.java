package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InitiatePaymentRequestDto_ {
    String name;
    String phoneNumber;
    String email;
    Double amount;
    String description;
}
