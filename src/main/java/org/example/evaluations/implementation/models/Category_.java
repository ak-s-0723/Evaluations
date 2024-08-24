package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Category_ {
    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category")
    private Set<Product_> products = new HashSet<>();
}
