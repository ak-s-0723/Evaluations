package org.example.evaluations.implementation.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Instructor_ {
    @Id
    private UUID id;

    @ManyToMany
    @JoinTable(name = "instructors_batches_", joinColumns = @JoinColumn(name = "instructor_id"),inverseJoinColumns = @JoinColumn(name="batch_id"))
    private Set<Batch_> batches=new HashSet<>();

    private String name;

    private String email;
}
