package org.example.evaluations.implementation.models;

import jakarta.persistence.*;

@Entity
public class TeacherRating_ {
    @EmbeddedId
    private TeacherRatingKey_ id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name="student_id")
    private Student_ student;

    @ManyToOne
    @MapsId("teacherId")
    @JoinColumn(name="teacher_id")
    private Teacher_ teacher;

    private int rating;
}
