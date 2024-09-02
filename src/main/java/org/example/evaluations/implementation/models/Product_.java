package org.example.evaluations.implementation.models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Product_ {
    @Id
    protected Long id;

    protected String name;
    @Enumerated(value = EnumType.STRING)
    protected Status_ status;

    @OneToOne
    private Subscription_ subscription;
}
