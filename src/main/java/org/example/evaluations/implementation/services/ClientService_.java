package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.exceptions.UserNotFoundException_;
import org.example.evaluations.implementation.models.Client_;
import org.example.evaluations.implementation.repos.ClientRepo_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService_ {
    @Autowired
    private ClientRepo_ clientRepo;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    public Client_ getClientFromId(Long id) throws UserNotFoundException_ {

        Optional<Client_> clientOptional = clientRepo.findById(id);
        if(clientOptional.isEmpty()) {
            throw new UserNotFoundException_("Please signup first");
        }

        return clientOptional.get();
    }

    public Client_ getClientFromEmail(String email) throws UserNotFoundException_ {
        Client_ client = (Client_) redisTemplate.opsForHash().get("CLIENTS",email);

        if (client == null) {
            throw new UserNotFoundException_("Please signup first");
        }

        return client;
    }
}
