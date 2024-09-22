package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.UserLocationDto_;
import org.example.evaluations.implementation.models.Restaurant_;
import org.example.evaluations.implementation.services.NearbyService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nearby/restaurants__")
public class NearbyController_ {

    @Autowired
    private NearbyService_ nearbyService;


    @PostMapping("/add")
    public Boolean addLocation(@RequestBody Restaurant_ restaurant) {
        return nearbyService.addLocation(restaurant);
    }

    @PostMapping
    public List<Restaurant_> findAllNearbyRestaurants(@RequestBody UserLocationDto_ userLocationDto) {
       return nearbyService.findNearbyLocations(userLocationDto.getLatitude(), userLocationDto.getLongitude(), userLocationDto.getRadius());
    }
}
