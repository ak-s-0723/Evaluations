package org.example.evaluations.evaluation.models;

import jakarta.persistence.Id;

public class CreditCard {

    @Id
    private String id;

    private CreditAccount credit;
}
