package org.example.evaluations.evaluation.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
public class Learner {
    @Id
    private UUID id;

    private String name;

    private String email;

    private Batch currentBatch;

    private Set<Batch> previousBatches=new HashSet<>();
}
