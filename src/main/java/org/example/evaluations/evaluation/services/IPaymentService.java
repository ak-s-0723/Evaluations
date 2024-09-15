package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.dtos.PaymentIntent;

import java.util.List;

public interface IPaymentService {
    String createPaymentIntent(Long amount);

    List<PaymentIntent> listPaymentIntents();

    Boolean cancelPaymentIntent(String id);
}
