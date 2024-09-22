package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddInfluencerDto_ {
    private String name;

    private Long followers;

    private Long totalPostReach;

    private String displayPictureUrl;

    private Long totalPosts;

    private String bio;
}
