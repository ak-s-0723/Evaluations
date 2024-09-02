package org.example.evaluations.implementation.models;

import jakarta.persistence.*;

@Entity
public class Subscription_ {
    @Id
    protected Long id;

    protected double charges;

    @Enumerated(value = EnumType.STRING)
    protected Status_ status;
}
