package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Booking_;
import org.example.evaluations.implementation.models.Guest_;
import org.example.evaluations.implementation.models.Room_;
import org.example.evaluations.implementation.repos.BookingRepository_;
import org.example.evaluations.implementation.repos.GuestRepository_;
import org.example.evaluations.implementation.repos.RoomRepository_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService_ {

    @Autowired
    private BookingRepository_ bookingRepository;


    @Autowired
    private GuestRepository_ guestRepository;

    @Autowired
    private RoomRepository_ roomRepository;

    public Page<Booking_> getAllBookingDoneByGuest(String guestEmail, Integer pageNumber, Integer pageSize) {
        Optional<Guest_> guestOptional = guestRepository.findById(guestEmail);
        if(guestOptional.isEmpty()) return  null;

        return bookingRepository.findBookingsByGuest(guestOptional.get(), PageRequest.of(pageNumber,pageSize));
    }


    // In case Mayor is having multiple bookings, pick first entry
    public Page<Booking_> getAllBookingsOnDateWhenMayorIsStaying(String firstName, String lastName, Integer pageNumber, Integer pageSize) {
         Optional<Guest_> guestOptional = guestRepository.findGuestByFirstNameAndLastName(firstName,lastName);
         if(guestOptional.isEmpty()) return null;

         Guest_ guest = guestOptional.get();
         List<Booking_> bookings = guest.getBookings();

         Booking_ booking = bookings.get(0);
         return  bookingRepository.findBookingByDate(booking.getDate(),PageRequest.of(pageNumber,pageSize));
    }

    public Page<Booking_> getAllBookingsDoneForRoomOnParticularDate(Long roomNumber, Date date, Integer pageNumber, Integer pageSize) {
          Optional<Room_> roomOptional = roomRepository.findById(roomNumber);
          if (roomOptional.isEmpty()) return null;

          return bookingRepository.findBookingByRoomsAndDate(roomOptional.get(), date, PageRequest.of(pageNumber,pageSize));
    }
}
