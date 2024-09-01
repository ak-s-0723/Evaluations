package org.example.evaluations.evaluation.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "2")
public class Pen extends Product {
    private PenType penType;
}
