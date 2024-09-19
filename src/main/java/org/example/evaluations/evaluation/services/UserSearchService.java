package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.User;
import org.example.evaluations.evaluation.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSearchService {

    @Autowired
    private UserRepository userRepository;

    private final Integer pageSize = 5;

    public List<User> getUsersHavingAddress(String address,Integer pageNumber) {
        return null;
    }

    public List<User> getDetailsOfAllLadies(Integer pageNumber) {
        return null;
    }

    public List<User> getDetailsOfAllAdultMales(Integer pageNumber) {
        return null;
    }
}
