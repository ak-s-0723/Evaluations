package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class SubCategory_ extends BaseModel_ {

    private String name;

    private String description;

    @ManyToOne
    private Category_ category;
}
