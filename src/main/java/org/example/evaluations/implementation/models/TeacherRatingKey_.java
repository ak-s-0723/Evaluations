package org.example.evaluations.implementation.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class TeacherRatingKey_ implements Serializable {

    @Column(name="student_id")
    private Long studentId;

    @Column(name="teacher_id")
    private Long teacherId;
}
