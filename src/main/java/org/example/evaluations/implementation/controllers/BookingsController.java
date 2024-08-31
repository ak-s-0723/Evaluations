package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.BookingRequestDto;
import org.example.evaluations.implementation.dtos.BookingResponseDto;
import org.example.evaluations.implementation.services.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingsController {

    @Autowired
    private IBookingService bookingService;

    @GetMapping("/bookings/guest/{guestEmail}")
    public List<BookingResponseDto> getAllBookingsForGuest(@PathVariable String guestEmail) {
          return bookingService.getAllBookingsPerGuest(guestEmail);
    }

    @GetMapping("/bookings/{bookingId}")
    public BookingResponseDto getBooking(@PathVariable Long bookingId) {
        return bookingService.getBooking(bookingId);
    }


    @PutMapping("/bookings/{bookingId}")
    public BookingResponseDto replaceBooking(@PathVariable Long bookingId, @RequestBody BookingRequestDto bookingRequestDto) {
       return bookingService.replaceBooking(bookingId,bookingRequestDto);
    }

    @PostMapping("/bookings")
    public BookingResponseDto createBooking(@RequestBody BookingRequestDto bookingRequestDto) {
      return bookingService.createBooking(bookingRequestDto);
    }

    @DeleteMapping("/bookings/{bookingId}")
    public Boolean deleteBooking(@PathVariable Long bookingId) {
      return bookingService.deleteBooking(bookingId);
    }
}


/*{
        "customerName" : "abcde",
        "customerEmail" : "defgh",
        "checkInDate" : "2024-10-12",
        "checkOutDate" : "2024-10-20",
        "roomRequestDtos" : [{
        "roomType" : "SUITE",
        "roomCount" : 10
        },{
        "roomType" : "DELUXE",
        "roomCount" : 20
        }]
 }
        */