package org.example.evaluations.implementation.models;

import jakarta.persistence.*;

@Entity
public class PayLater_ extends PurchaseDetails_ {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
}
