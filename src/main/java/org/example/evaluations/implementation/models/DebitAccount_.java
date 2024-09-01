package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "DebitAccount_")
@PrimaryKeyJoinColumn(name = "account_id_")
public class DebitAccount_ extends Account_ {

    @OneToOne(mappedBy = "debit")
    private DebitCard_ debitCard;

    private double balance;
}
