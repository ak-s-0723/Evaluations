package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;

@Entity
public class Book_ extends Product_ {
    private BookType_ bookType;
}
