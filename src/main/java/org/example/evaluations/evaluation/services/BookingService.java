package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.Booking;
import org.example.evaluations.evaluation.repos.BookingRepository;
import org.example.evaluations.evaluation.repos.GuestRepository;
import org.example.evaluations.evaluation.repos.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private GuestRepository guestRepository;

    @Autowired
    private RoomRepository roomRepository;

    public Page<Booking> getAllBookingDoneByGuest(String guestEmail, Integer pageNumber, Integer pageSize) {
        return null;
    }

    // In case Mayor is having multiple bookings, pick first entry
    public Page<Booking> getAllBookingsOnDateWhenMayorIsStaying(String firstName,String lastName, Integer pageNumber,Integer pageSize) {
        return null;
    }

    public Page<Booking> getAllBookingsDoneForRoomOnParticularDate(Long roomNumber, Date date,Integer pageNumber,Integer pageSize) {
        return null;
    }
}
