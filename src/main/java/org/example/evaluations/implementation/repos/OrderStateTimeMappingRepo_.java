package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Order_;
import org.example.evaluations.implementation.models.OrderStateTimeMapping_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderStateTimeMappingRepo_ extends JpaRepository<OrderStateTimeMapping_,Long> {
    Optional<OrderStateTimeMapping_> findByOrder(Order_ order);
}
