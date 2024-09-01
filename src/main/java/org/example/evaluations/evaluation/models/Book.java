package org.example.evaluations.evaluation.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "1")
public class Book extends Product {
    private BookType bookType;
}
