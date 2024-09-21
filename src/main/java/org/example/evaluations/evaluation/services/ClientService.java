package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.exceptions.UserNotFoundException;
import org.example.evaluations.evaluation.models.Client;
import org.example.evaluations.evaluation.repos.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepo clientRepo;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    public Client getClientFromId(Long id) throws UserNotFoundException {
       return null;
    }

    public Client getClientFromEmail(String email) throws UserNotFoundException {
       return null;
    }
}
