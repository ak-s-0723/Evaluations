package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

import java.net.URL;

@Setter
@Getter
public class CompletePaymentDto_ {
    String name;
    String phoneNumber;
    String email;
    Double amount;
    String description;
    String orderId;
    URL callback;
}
