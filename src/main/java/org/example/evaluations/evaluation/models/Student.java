package org.example.evaluations.evaluation.models;

import jakarta.persistence.*;

import java.util.Set;

public class Student {

    @Id
    private Long id;

    private String name;

    private Set<Teacher> teachers;

    Set<TeacherRating> ratings;
}
