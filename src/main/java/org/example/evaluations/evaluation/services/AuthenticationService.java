package org.example.evaluations.evaluation.services;


import org.example.evaluations.evaluation.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;

@Service
public class AuthenticationService {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Autowired
    private SecretKey secretKey;

    @Autowired
    private UserRepo userRepo;

    public void setSecretKey(SecretKey secretKey) {
        this.secretKey = secretKey;
    }

    public ResponseEntity<Boolean> login(String email, String password) {
        return null;
    }

    public Boolean validateToken(String email,String token) {
        return null;
    }
}
