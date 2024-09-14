package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.clients.StripePaymentGateway_;
import org.example.evaluations.implementation.dtos.SessionDto_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService_ implements ISessionService_ {

    @Autowired
    private StripePaymentGateway_ stripePaymentGateway;

    public SessionDto_ createSession(String successUrl, List<Long> amounts, List<String> productNames, List<Long> quantities) {
        return stripePaymentGateway.createSession(successUrl,amounts,productNames,quantities);
    }
}
