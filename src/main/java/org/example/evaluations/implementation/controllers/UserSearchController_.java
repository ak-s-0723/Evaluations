package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.UserSearchRequestDto_;
import org.example.evaluations.implementation.models.User;
import org.example.evaluations.implementation.services.UserSearchService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserSearchController_ {

    @Autowired
    private UserSearchService_ userSearchService;

    @PostMapping("/search_")
    public List<User> searchUsersByAddress(@RequestBody UserSearchRequestDto_ userSearchRequestDto) {
          return userSearchService.getUsersHavingAddress(userSearchRequestDto.getQuery(), userSearchRequestDto.getPageNumber());
    }

    @GetMapping("search_/ladies")
    public List<User> searchLadies(@RequestParam(required = true) Integer pageNumber) {
        return userSearchService.getDetailsOfAllLadies(pageNumber);
    }

    @GetMapping("search_/adultMales")
    public List<User> searchAdultMales(@RequestParam(required = true) Integer pageNumber) {
        return userSearchService.getDetailsOfAllAdultMales(pageNumber);
    }
}
