package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Order_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo_ extends JpaRepository<Order_,Long> {
    Order_ save(Order_ order);
}
