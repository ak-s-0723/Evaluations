package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.*;

@Entity
public class InstagramUser_ {
    @Id
    private UUID id;

    private String name;

    @OneToMany(mappedBy = "creator")
    private Set<InstagramPage_> pages = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private List<InstagramLike_> instagramLikes = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<InstagramComment_> instagramComments = new ArrayList<>();
}
