package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Team_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TeamRepo_ extends JpaRepository<Team_, UUID> {
}
