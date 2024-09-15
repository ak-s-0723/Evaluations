package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.dtos.PaymentIntent_;

import java.util.List;

public interface IPaymentService_ {
    String createPaymentIntent(Long amount);

    List<PaymentIntent_> listPaymentIntents();

    Boolean cancelPaymentIntent(String id);
}
