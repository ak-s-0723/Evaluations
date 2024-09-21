package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.exceptions.UserAlreadyExistsException;
import org.example.evaluations.evaluation.models.Client;
import org.example.evaluations.evaluation.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    @Autowired
    private ClientRepo clientRepo;


    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    public Client signup(String email,String password,String name,String phoneNumber) throws UserAlreadyExistsException {
       return null;
    }
}
