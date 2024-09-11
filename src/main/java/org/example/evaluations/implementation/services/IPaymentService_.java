package org.example.evaluations.implementation.services;

public interface IPaymentService_ {
    String getPaymentLink(Long amount, Long quantity, String callbackUrl, String productName);
}
