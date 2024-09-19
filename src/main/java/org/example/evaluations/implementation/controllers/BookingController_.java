package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.BookingSearchDto_;
import org.example.evaluations.implementation.models.Booking_;
import org.example.evaluations.implementation.services.BookingService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookingController_ {

    @Autowired
    private BookingService_ bookingService;

    @PostMapping("bookings_/guestEmail")
    public Page<Booking_> getAllBookingDoneByGuest(@RequestBody BookingSearchDto_ bookingSearchDto) {
         return bookingService.getAllBookingDoneByGuest(bookingSearchDto.getGuestEmail(),bookingSearchDto.getPageNumber(), bookingSearchDto.getPageSize());
     }


     @PostMapping("bookings_/guestName")
    public Page<Booking_> getAllBookingsOnDateWhenMayorIsStaying(@RequestBody BookingSearchDto_ bookingSearchDto) {
         return bookingService.getAllBookingsOnDateWhenMayorIsStaying(bookingSearchDto.getGuestFirstName(), bookingSearchDto.getGuestLastName(), bookingSearchDto.getPageNumber(), bookingSearchDto.getPageSize());
     }


     @PostMapping("bookings_/roomNumber_date")
    public Page<Booking_> getAllBookingsDoneForRoomOnParticularDate(@RequestBody BookingSearchDto_ bookingSearchDto) {
        return bookingService.getAllBookingsDoneForRoomOnParticularDate(bookingSearchDto.getRoomNumber(), bookingSearchDto.getBookingDate(), bookingSearchDto.getPageNumber(), bookingSearchDto.getPageSize());
     }
}
