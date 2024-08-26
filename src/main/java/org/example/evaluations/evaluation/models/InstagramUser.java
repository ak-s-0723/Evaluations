package org.example.evaluations.evaluation.models;

import jakarta.persistence.Id;


import java.util.*;

public class InstagramUser {
    @Id
    private UUID id;

    private String name;

    private Set<InstagramPage> pages = new HashSet<>();

    private List<InstagramLike> instagramLikes = new ArrayList<>();

    private List<InstagramComment> instagramComments = new ArrayList<>();
}
