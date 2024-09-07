package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Inventory_;
import org.example.evaluations.implementation.models.Item_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepo_ extends JpaRepository<Inventory_,Long> {
    Optional<Inventory_> findByItem(Item_ item);

    Inventory_ save(Inventory_ inventory);
}
