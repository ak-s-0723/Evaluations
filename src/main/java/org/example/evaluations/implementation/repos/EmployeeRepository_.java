package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Employee_;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository_ extends JpaRepository<Employee_,Long> {

    Page<Employee_> findEmployeeByDepartment(String department, Pageable pageable);
}
