package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Inventory_ extends BaseModel_ {
    @OneToOne
    private Item_ item;

    private Double count;

    private Double orderingCost;

    private Double stockOutCost;
}
