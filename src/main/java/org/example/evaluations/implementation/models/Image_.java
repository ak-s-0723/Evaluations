package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Image_ extends BaseModel_ {
    private String resolution;

    private Long sizeInKb;

    @ManyToOne
    private Product_ product;

    private String descriptiveName;
}
