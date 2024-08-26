package org.example.evaluations.evaluation.models;

import jakarta.persistence.Id;

import java.util.List;
import java.util.UUID;

public class InstagramPost {
    @Id
    private UUID id;

    private InstagramPage instagramPage;

    private List<InstagramLike> instagramLikes;

    private List<InstagramComment> instagramComments;

    private String content;
}

