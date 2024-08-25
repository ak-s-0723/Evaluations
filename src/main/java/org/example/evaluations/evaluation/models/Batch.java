package org.example.evaluations.evaluation.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
public class Batch {
    @Id
    private UUID id;

    private List<Instructor> instructors;

    private String name;

    private Set<Learner> learners = new HashSet<>();

    private Set<Class> classes;
}
