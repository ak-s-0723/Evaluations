package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Address_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo_ extends JpaRepository<Address_, Long> {
}