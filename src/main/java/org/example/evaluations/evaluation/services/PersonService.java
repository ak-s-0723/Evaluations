package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.repos.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public Set<String> getAllUniqueCities() {
        return null;
    }

    public Set<String> getCitiesWherePersonLivedAt(Long personId) {
        return null;
    }
}
