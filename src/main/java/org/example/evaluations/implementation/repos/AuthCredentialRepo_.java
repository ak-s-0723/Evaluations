package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.AuthCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthCredentialRepo_ extends JpaRepository<AuthCredential,String> {
    Optional<AuthCredential> findAuthCredentialByEmail(String email);
}
