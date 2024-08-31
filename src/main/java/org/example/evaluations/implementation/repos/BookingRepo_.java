package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Booking_;
import org.example.evaluations.implementation.models.Guest_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepo_ extends JpaRepository<Booking_,Long> {
    List<Booking_> findBookingsByGuest(Guest_ guest);
}
