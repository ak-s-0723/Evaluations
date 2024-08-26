package org.example.evaluations.evaluation.models;

import jakarta.persistence.Id;

import java.util.Set;

public class Teacher {

    @Id
    private Long id;

    private String name;

    private Set<Student> students;

    private Set<TeacherRating> ratings;
}
