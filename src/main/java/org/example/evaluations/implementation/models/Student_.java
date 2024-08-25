package org.example.evaluations.implementation.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Student_ {

    @Id
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "students_teachers_",joinColumns = @JoinColumn(name = "student_id"),inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private Set<Teacher_> teachers;

    @OneToMany(mappedBy = "student")
    Set<TeacherRating_> ratings;
}
