package org.example.evaluations.evaluation.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
public class Instructor {
    @Id
    private UUID id;

    private Set<Batch> batches=new HashSet<>();

    private String name;

    private String email;
}
