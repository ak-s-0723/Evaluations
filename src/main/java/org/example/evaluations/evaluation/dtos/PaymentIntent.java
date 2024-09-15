package org.example.evaluations.evaluation.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class PaymentIntent {
    Long amount;
    String id;
    List<String> paymentMethodTypes = new ArrayList<>();
    Boolean AreAutomaticPaymentMethodsEnabled;
    String status;
}
