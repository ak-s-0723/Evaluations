package org.example.evaluations.evaluation.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
public class HarryPotter extends Book {
    int x;
}
