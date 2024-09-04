package org.example.evaluations.implementation.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Employee_ {

    @Id
    private Long id;

    private String name;

    private Double costToCompany;

    @ManyToOne(cascade = CascadeType.ALL)
    private Team_ team;

    @OneToMany(mappedBy = "employee",fetch = FetchType.EAGER)
    List<IdentityProof_> proofs;
}
