package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Class_ {
    @Id
    private UUID id;

    private String topic;

    @ManyToMany(mappedBy = "classes")
    private Set<Batch_> batches;

    @ManyToOne
    private Instructor_ currentInstructor;
}
