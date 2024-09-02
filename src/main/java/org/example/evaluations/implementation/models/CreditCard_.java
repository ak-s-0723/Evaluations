package org.example.evaluations.implementation.models;

import jakarta.persistence.*;

@Entity
@AttributeOverride(
        name = "owner",
        column = @Column(name = "CREDIT_CARD_OWNER", nullable = false)
)
public class CreditCard_ extends PurchaseDetails_ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String cardNumber;

    protected Long creditLimit;
}
