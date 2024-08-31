package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Guest_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GuestRepo_ extends JpaRepository<Guest_,String> {
    Optional<Guest_> findByEmail(String email);
}
