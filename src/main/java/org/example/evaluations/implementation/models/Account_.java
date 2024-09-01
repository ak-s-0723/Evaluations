package org.example.evaluations.implementation.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity(name = "Account_")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account_ {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String owner;

}
