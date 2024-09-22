package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Influencer_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InfluencerService_ {

    private static final long MIN_FOLLOWERS_NEEDED_TO_VIRAL = 500000;
    private static final long MIN_POST_REACH = 5000000;
    private static final String VIRAL_INFLUENCER_REDIS_KEY  = "influencer";

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    public Boolean addInfluencerToCache(Influencer_ influencer) {
        if(isPopularInfluencer(influencer)) {
            redisTemplate.opsForHash().put(VIRAL_INFLUENCER_REDIS_KEY,influencer.getId(),influencer);
            return true;
        }

        return false;
    }

    public Influencer_ getInfluencerDetails(Long id) {
        Influencer_ influencer = (Influencer_) redisTemplate.opsForHash().get(VIRAL_INFLUENCER_REDIS_KEY,id);
        return influencer;
    }


    public List<Influencer_> getAllViralInfluencers() {
        List<Influencer_> influencers = new ArrayList<>();
        List<Object> values = redisTemplate.opsForHash().values(VIRAL_INFLUENCER_REDIS_KEY);
        for (Object value : values) {
            if (value instanceof Influencer_) {
                influencers.add((Influencer_) value);
            }
        }
        return influencers;
    }

    private boolean isPopularInfluencer(Influencer_ influencer) {
        return influencer.getFollowers() > MIN_FOLLOWERS_NEEDED_TO_VIRAL || influencer.getTotalPostReach() > MIN_POST_REACH;
    }
}
