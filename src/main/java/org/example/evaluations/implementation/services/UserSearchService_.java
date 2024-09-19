package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Sex_;
import org.example.evaluations.implementation.models.User;
import org.example.evaluations.implementation.repos.UserRepository_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSearchService_ {

    @Autowired
    private UserRepository_ userRepository;

    private final Integer pageSize = 5;

    public List<User> getUsersHavingAddress(String address,Integer pageNumber) {
        return userRepository.findUserByAddressEquals(address, PageRequest.of(pageNumber,pageSize));
    }

    public List<User> getDetailsOfAllLadies(Integer pageNumber) {
        return userRepository.findUserBySexEquals(Sex_.FEMALE,PageRequest.of(pageNumber,pageSize));
    }

    public List<User> getDetailsOfAllAdultMales(Integer pageNumber) {
        return userRepository.findUserBySexAndAgeGreaterThanEqual(Sex_.MALE,18,PageRequest.of(pageNumber,pageSize));
    }
}
