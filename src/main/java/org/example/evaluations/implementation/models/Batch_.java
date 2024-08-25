package org.example.evaluations.implementation.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Batch_ {
    @Id
    private UUID id;

    @ManyToMany(mappedBy = "batches")
    private List<Instructor_> instructors;

    private String name;

    @OneToMany(mappedBy = "currentBatch")
    private Set<Learner_> learners = new HashSet<>();

    @ManyToMany
    @JoinTable(name="batches_classes_",joinColumns = @JoinColumn(name="batch_id"),inverseJoinColumns = @JoinColumn(name="class_id"))
    private Set<Class_> classes;
}
