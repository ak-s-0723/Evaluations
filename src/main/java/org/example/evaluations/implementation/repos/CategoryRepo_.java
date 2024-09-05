package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Category_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo_ extends JpaRepository<Category_,Long> {
}
