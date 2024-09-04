package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class IdentityProof_ {
    @Id
    private Long id;

    private String name;

    @ManyToOne
    private Employee_ employee;
}
