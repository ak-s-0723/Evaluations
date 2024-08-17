package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.BookingUpdateRequestDto;
import org.example.evaluations.implementation.models.Booking;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@RestController
public class BookingsController {

    @GetMapping("/bookings/{bookingId:[\\d]+}")
    public Booking getBookingById(@PathVariable Long bookingId) {
        Booking booking = new Booking();
        booking.setId(bookingId);
        return booking;
    }


    @GetMapping("/bookings/guest/{guest}/date/{date}")
    public Booking getBookingByGuestNameAndDate(@PathVariable("guest") String guestName,
                                                @PathVariable("date") String date) {
        Booking booking = new Booking();
        booking.setGuestName(guestName);
        Date Date = from(date);
        if(Date == null) return null;
        booking.setDate(Date);
        return booking;
    }


    @GetMapping("/bookings/date/{date}")
    public List<Booking> listBookingsOfParticularDate(@PathVariable String date) {
        List<Booking> bookings = new ArrayList<>();
        Booking booking = new Booking();
        Date Date = from(date);
        if(Date == null) return null;
        booking.setDate(Date);
        bookings.add(booking);
        return bookings;
    }


    @PutMapping("/bookings/{bookingId:[\\d]+}")
    public Booking updateBooking(@PathVariable Long bookingId, @RequestBody BookingUpdateRequestDto requestDto) {
        Booking booking = new Booking();
        booking.setId(bookingId);
        booking.setGuestName(requestDto.getGuestName());
        Date date = from(requestDto.getDate());
        if(date == null) return null;
        booking.setDate(date);
        return booking;
    }

    private Date from(String date) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(date);
        }catch (ParseException exception) {
            return null;
        }
    }
}
