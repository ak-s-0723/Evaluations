package org.example.evaluations.evaluation.models;

import jakarta.persistence.Id;

public class DebitCard {

    @Id
    private String id;

    private DebitAccount debit;
}
