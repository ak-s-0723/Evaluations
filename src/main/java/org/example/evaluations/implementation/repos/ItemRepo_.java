package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Item_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo_ extends JpaRepository<Item_,Long> {
}
