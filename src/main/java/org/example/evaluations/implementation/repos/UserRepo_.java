package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.User_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo_ extends JpaRepository<User_,Long> {
    Optional<User_> findUserByEmail(String email);
}
