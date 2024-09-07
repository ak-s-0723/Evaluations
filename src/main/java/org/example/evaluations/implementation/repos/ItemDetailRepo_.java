package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.ItemDetail_;
import org.example.evaluations.implementation.models.Order_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemDetailRepo_ extends JpaRepository<ItemDetail_,Long> {
    ItemDetail_ save(ItemDetail_ itemDetail);
    Optional<ItemDetail_> findByOrder(Order_ order);
}
