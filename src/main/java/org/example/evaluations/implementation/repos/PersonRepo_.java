package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Person_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo_ extends JpaRepository<Person_, Long> {
}
