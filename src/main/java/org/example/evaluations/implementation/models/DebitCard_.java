package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "DebitCard_")
public class DebitCard_ {

    @Id
    private String id;

    @OneToOne
    private DebitAccount_ debit;
}
