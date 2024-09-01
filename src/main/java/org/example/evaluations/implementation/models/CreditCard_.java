package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "CreditCard_")
public class CreditCard_ {

    @Id
    private String id;

    @ManyToOne
    private CreditAccount_ credit;
}
