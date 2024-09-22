package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.Influencer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfluencerService {

    private static final long MIN_FOLLOWERS_NEEDED_TO_VIRAL = 500000;
    private static final long MIN_TOTAL_POST_REACH = 5000000;
    private static final String VIRAL_INFLUENCER_REDIS_KEY  = "influencer";

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    public Boolean addInfluencerToCache(Influencer influencer) {
        return null;
    }

    public Influencer getInfluencerDetails(Long id) {
        return null;
    }


    public List<Influencer> getAllViralInfluencers() {
        return null;
    }
}
