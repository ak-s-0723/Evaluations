package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NearbyService {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    private static final String LOCATION_KEY = "nearby_restaurants";


    public Boolean addLocation(Restaurant restaurant) {
        return null;
    }

    public List<Restaurant> findNearbyLocations(double userLatitude, double userLongitude, double radius) {
        return null;
    }
}
