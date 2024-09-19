package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Booking_;
import org.example.evaluations.implementation.models.Guest_;
import org.example.evaluations.implementation.models.Room_;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public interface BookingRepository_ extends JpaRepository<Booking_, UUID> {
       Page<Booking_> findBookingsByGuest(Guest_ guest, Pageable pageable);

       List<Booking_> findBookingsByGuestFirstNameAndGuestLastName(String firstName, String lastName);

       Page<Booking_> findBookingByDate(Date date, Pageable pageable);

       Page<Booking_> findBookingByRoomsAndDate(Room_ room, Date date, Pageable pageable);
}
