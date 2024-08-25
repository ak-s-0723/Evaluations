package org.example.evaluations.evaluation.models;

import jakarta.persistence.Id;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
public class Class {
    @Id
    private UUID id;

    private String topic;

    private Set<Batch> batches;

    private Instructor currentInstructor;
}
