package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Room_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public interface RoomRepository_ extends JpaRepository<Room_,Long> {
    Optional<Room_> findById(Long id);
}
