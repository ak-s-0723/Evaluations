package org.example.evaluations.evaluation.models;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Team {
    private UUID id;

    private List<Employee> employees;

    private Double budget;

    private String location;
}
