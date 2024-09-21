package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Client_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepo_ extends JpaRepository<Client_,Long> {

    Optional<Client_> findClientByEmail(String email);
}
