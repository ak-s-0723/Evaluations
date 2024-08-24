package org.example.evaluations.implementation.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Product_ {
    @Id
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private Category_ category;

    private String description;

    private String imageUrl;

    private Double price;

    private Date createdAt;
}
