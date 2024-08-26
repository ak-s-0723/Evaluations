package org.example.evaluations.evaluation.models;

import jakarta.persistence.Id;

import java.util.UUID;

public class InstagramComment {
    @Id
    private UUID id;

    private InstagramPost post;

    private InstagramUser user;

    private String text;
}
