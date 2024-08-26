package org.example.evaluations.evaluation.models;

import jakarta.persistence.Id;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class InstagramPage {
    @Id
    private UUID id;

    private Set<InstagramPost> posts = new HashSet<>();

    private InstagramUser creator;
}

