package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class PaymentIntent_ {
    Long amount;
    String id;
    List<String> paymentMethodTypes = new ArrayList<>();
    Boolean AreAutomaticPaymentMethodsEnabled;
    String status;
}
