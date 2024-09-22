package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.AddInfluencerDto_;
import org.example.evaluations.implementation.models.Influencer_;
import org.example.evaluations.implementation.services.InfluencerService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/influencer__")
public class InfluencerController_ {

    @Autowired
    private InfluencerService_ influencerService;


    @PostMapping
    public Boolean addInfluencer(@RequestBody AddInfluencerDto_ addInfluencerDto) {
        Influencer_ influencer = new Influencer_();
        influencer.setFollowers(addInfluencerDto.getFollowers());
        influencer.setName(addInfluencerDto.getName());
        influencer.setBio(addInfluencerDto.getBio());
        influencer.setTotalPosts(addInfluencerDto.getTotalPosts());
        influencer.setDisplayPictureUrl(addInfluencerDto.getDisplayPictureUrl());
        influencer.setTotalPostReach(addInfluencerDto.getTotalPostReach());
        return influencerService.addInfluencerToCache(influencer);
    }


    @GetMapping
    public List<Influencer_> getAllViralInfluencers() {
        return influencerService.getAllViralInfluencers();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Influencer_> getInfluencer(@PathVariable Long id) {
        Influencer_ influencer = influencerService.getInfluencerDetails(id);
        if(influencer == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(influencer,HttpStatus.OK);
    }
}
