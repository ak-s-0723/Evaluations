package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.AuthCredential;
import org.example.evaluations.implementation.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo_ extends JpaRepository<User,Long> {
    Optional<User> findUserByAuthCredential(AuthCredential authCredential);
}
