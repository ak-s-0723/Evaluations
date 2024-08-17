package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.dtos.BookingUpdateRequestDto;
import org.example.evaluations.evaluation.models.Booking;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@RestController
public class BookingController {

    public Booking getBookingById(Long bookingId) {
       Booking booking = new Booking();
       booking.setId(bookingId);
       return booking;
    }


    public Booking getBookingByGuestNameAndDate(String guestName, String date) {
            Booking booking = new Booking();
            booking.setGuestName(guestName);
            Date Date = from(date);
             if(Date == null) return null;
             booking.setDate(Date);
             return booking;
    }


    public List<Booking> listBookingsOfParticularDate(String date) {
       List<Booking> bookings = new ArrayList<>();
       Booking booking = new Booking();
        Date Date = from(date);
        if(Date == null) return null;
        booking.setDate(Date);
        bookings.add(booking);
        return bookings;
    }



    public Booking updateBooking(Long bookingId,BookingUpdateRequestDto requestDto) {
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
