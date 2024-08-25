package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.UUID;

@Entity
public class InstagramPost_ {
    @Id
    private UUID id;

    @ManyToOne
    private InstagramPage_ instagramPage;

    @OneToMany(mappedBy = "post")
    private List<InstagramLike_> instagramLikes;

    @OneToMany(mappedBy = "post")
    private List<InstagramComment_> instagramComments;

    private String content;
}

