package org.example.evaluations.implementation.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Learner_ {
    @Id
    private UUID id;

    private String name;

    private String email;

    @ManyToOne
    private Batch_ currentBatch;

    @ManyToMany
    @JoinTable(name = "learners_previous_batches_",joinColumns = @JoinColumn(name = "learner_id"),inverseJoinColumns = @JoinColumn(name="previous_batch_id"))
    private Set<Batch_> previousBatches=new HashSet<>();
}
