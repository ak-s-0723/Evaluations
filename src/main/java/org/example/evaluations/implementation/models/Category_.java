package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Category_ {
    @Id
    private Long id;
    private String name;
    private String description;
    private Boolean isPremium;
}
