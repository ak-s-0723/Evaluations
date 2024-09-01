package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "CreditAccount_")
@PrimaryKeyJoinColumn(name = "account_id_")
public class CreditAccount_ extends Account_ {

    @OneToMany(mappedBy = "credit")
    private Set<CreditCard_> creditCard = new HashSet<>();

    private double interestRate;
}

