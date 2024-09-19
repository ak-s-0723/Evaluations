package org.example.evaluations.evaluation.repos;

import org.example.evaluations.evaluation.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface RoomRepository extends JpaRepository<Room,Long> {
}
