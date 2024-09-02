package org.example.evaluations.implementation.models;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Employee_ {
    private Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String address;
}
