package org.example.evaluations.implementation.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("Book_")
public class Book_ extends Publication_ {
    private Integer numberOfPages;

    private Double cost;
}
