package org.example.evaluations.implementation.models;

import jakarta.persistence.*;

@Entity
@AttributeOverride(
        name = "owner",
        column = @Column(name = "ACCOUNT_HOLDER", nullable = false)
)
public class BankAccount_ extends PurchaseDetails_ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    protected String bankName;

    protected String number;
}
