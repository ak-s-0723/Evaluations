package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.dtos.SessionDto_;

import java.util.List;

public interface ISessionService_ {
    SessionDto_ createSession(String successUrl, List<Long> amounts, List<String> productNames, List<Long> quantities);
}
