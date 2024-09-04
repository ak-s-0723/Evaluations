package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Employee_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo_ extends JpaRepository<Employee_,Long> {
}
