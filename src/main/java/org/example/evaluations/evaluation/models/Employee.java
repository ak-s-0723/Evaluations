package org.example.evaluations.evaluation.models;

import lombok.Data;

import java.util.List;

@Data
public class Employee {

    private Long id;

    private String name;

    private Double costToCompany;

    private Team team;

    List<IdentityProof> proofs;
}
