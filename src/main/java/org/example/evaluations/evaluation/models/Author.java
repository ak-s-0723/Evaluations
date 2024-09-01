package org.example.evaluations.evaluation.models;

import jakarta.persistence.Id;

import java.util.List;

public class Author {
    @Id
    private Long id;

    private String name;

    private List<Publication> publications;
}
