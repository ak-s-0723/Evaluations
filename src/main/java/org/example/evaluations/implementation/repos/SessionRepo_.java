package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Session;
import org.example.evaluations.implementation.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SessionRepo_ extends JpaRepository<Session,Long> {
    Optional<Session> findSessionByUser(User user);
}
