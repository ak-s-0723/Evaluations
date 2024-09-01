package org.example.evaluations.implementation.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("BlogPost_")
public class BlogPost_ extends Publication_ {
    private String url;
}
