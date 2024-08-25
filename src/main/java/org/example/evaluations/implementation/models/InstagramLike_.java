package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

@Entity
public class InstagramLike_ {
    @Id
    private UUID id;

    @ManyToOne
    private InstagramPost_ post;

    @ManyToOne
    private InstagramUser_ user;
}
