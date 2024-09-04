package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Team_;
import org.example.evaluations.implementation.repos.TeamRepo_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class TeamService_ {

    @Autowired
    private TeamRepo_ teamRepo;

    public Team_ getTeamDetails(UUID teamId) {
        Optional<Team_> teamOptional = teamRepo.findById(teamId);
        return teamOptional.get();
    }
}
