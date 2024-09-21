package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.exceptions.UserAlreadyExistsException_;
import org.example.evaluations.implementation.models.Client_;
import org.example.evaluations.implementation.repos.ClientRepo_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class SignupService_ {

    @Autowired
    private ClientRepo_ clientRepo;


    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    public Client_ signup(String email, String password, String name, String phoneNumber) throws UserAlreadyExistsException_ {
        try {
            Optional<Client_> optionalClient = clientRepo.findClientByEmail(email);
            if (optionalClient.isPresent()) throw new UserAlreadyExistsException_("Please try out with some other email.");

            Client_ client = new Client_();
            client.setName(name);
            client.setCreatedOn(new Date());
            client.setPassword(password);
            client.setEmail(email);
            client.setPhoneNumber(phoneNumber);
            redisTemplate.opsForHash().put("CLIENTS",client.getEmail(),client);
            clientRepo.save(client);

            return client;
        } catch (UserAlreadyExistsException_ exception) {
            throw exception;
        }
    }
}
