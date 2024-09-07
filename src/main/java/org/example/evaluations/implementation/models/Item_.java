package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Item_ extends BaseModel_ {
    private String title;
    private String description;
    private String imageUrl;
    private Double price;
    private Boolean isPremium;

    @OneToOne(mappedBy = "item")
    private Inventory_ inventory;
}
