package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.dtos.PayoutPurpose_;

public interface IPayoutService_ {
    String createPayoutToBankAccount(String accountNumber, Double amount, PayoutPurpose_ purpose, String referenceId, String narration);
}
