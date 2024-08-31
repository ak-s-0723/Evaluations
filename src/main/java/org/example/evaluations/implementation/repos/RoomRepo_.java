package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Room_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepo_ extends JpaRepository<Room_,Long> {
}
