package org.example.evaluations.evaluation.models;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="product_type",discriminatorType = DiscriminatorType.INTEGER)
public class Product {
    @Id
    private Long id;
    private String description;
    private String name;
    private ProductState state;
}
