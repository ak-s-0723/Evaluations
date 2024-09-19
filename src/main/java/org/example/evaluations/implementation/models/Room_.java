package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Room_ {
    @Id
    private Long id;

    private RoomType_ roomType;

    @ManyToMany(mappedBy = "rooms")
    private List<Booking_> bookings;
}
