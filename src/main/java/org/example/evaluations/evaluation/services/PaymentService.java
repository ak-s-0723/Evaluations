package org.example.evaluations.evaluation.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentService implements IPaymentService {

    @Override
    public String initiatePayment(String name, String phoneNumber, String email, Double amount,String description) {
        return null;
    }
}
