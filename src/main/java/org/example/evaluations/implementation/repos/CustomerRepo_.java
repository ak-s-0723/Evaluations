package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Customer_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo_ extends JpaRepository<Customer_,Long> {
}
