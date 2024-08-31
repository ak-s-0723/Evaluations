package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.dtos.BookingRequestDto;
import org.example.evaluations.implementation.dtos.BookingResponseDto;
import org.example.evaluations.implementation.dtos.RoomRequestDto;
import org.example.evaluations.implementation.models.Booking_;
import org.example.evaluations.implementation.models.Guest_;
import org.example.evaluations.implementation.models.Room_;
import org.example.evaluations.implementation.models.RoomType_;
import org.example.evaluations.implementation.repos.BookingRepo_;
import org.example.evaluations.implementation.repos.RoomRepo_;
import org.example.evaluations.implementation.repos.GuestRepo_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

@Service
public class StorageBookingServiceImpl implements IBookingService {

    @Autowired
    private BookingRepo_ bookingRepo;

    @Autowired
    private GuestRepo_ guestRepo;

    @Autowired
    private RoomRepo_ roomRepo;


    @Override
    public BookingResponseDto getBooking(Long bookingId) {
        Optional<Booking_> optionalBooking = bookingRepo.findById(bookingId);
        if(optionalBooking.isPresent()) {
            return from(optionalBooking.get());
        }
        return null;
    }

    @Override
    public List<BookingResponseDto> getAllBookingsPerGuest(String userEmail) {
        List<BookingResponseDto> responseDtos = new ArrayList<>();
        Optional<Guest_> userOptional = guestRepo.findByEmail(userEmail);
        List<Booking_> bookings =  bookingRepo.findBookingsByGuest(userOptional.get());
        for(Booking_ booking : bookings) {
            responseDtos.add(from(booking));
        }

        return responseDtos;
    }

    @Override
    public BookingResponseDto replaceBooking(Long bookingId, BookingRequestDto bookingRequestDto) {
        Optional<Booking_> optionalBooking = bookingRepo.findById(bookingId);
        if(optionalBooking.isEmpty()) {
            return null;
        }

        deleteBooking(bookingId);
        return createBooking(bookingRequestDto);
    }

    @Override
    public BookingResponseDto createBooking(BookingRequestDto bookingRequestDto) {
        Booking_ booking = new Booking_();
        Double totalBill = 0D;
        List<Room_> rooms = new ArrayList<>();
        Long numberOfDays = ChronoUnit.DAYS.between(LocalDate.parse(bookingRequestDto.getCheckInDate()), LocalDate.parse(bookingRequestDto.getCheckOutDate()));
        if(numberOfDays == 0) numberOfDays++;
        booking.setCheckInDate(from(bookingRequestDto.getCheckInDate()));
        booking.setCheckOutDate(from(bookingRequestDto.getCheckOutDate()));
        for(RoomRequestDto roomRequestDto : bookingRequestDto.getRoomRequestDtos()) {
            Room_ room = from(roomRequestDto);
            room.setBooking(booking);
            rooms.add(room);
            totalBill += room.getRent();
        }

        totalBill *= numberOfDays;
        booking.setTotalBill(totalBill);
        booking.setRooms(rooms);


        Guest_ guest = new Guest_();
        guest.setEmail(bookingRequestDto.getCustomerEmail());
        guest.setName(bookingRequestDto.getCustomerName());
        booking.setGuest(guest);

        bookingRepo.save(booking);

        for(Room_ room : rooms) {
            roomRepo.save(room);
        }
        return from(booking);
    }

    @Override
    public Boolean deleteBooking(Long bookingId) {
        Optional<Booking_> optionalBooking = bookingRepo.findById(bookingId);
        if(optionalBooking.isEmpty()) {
            return false;
        }
       bookingRepo.deleteById(bookingId);
       return true;
    }

    private BookingResponseDto from(Booking_ booking) {
        BookingResponseDto responseDto = new BookingResponseDto();
        responseDto.setBookingId(booking.getId());
        responseDto.setRooms(booking.getRooms());
        responseDto.setGuest(booking.getGuest());
        responseDto.setTotalBill(booking.getTotalBill());
        responseDto.setCheckOutDate(booking.getCheckOutDate());
        responseDto.setCheckInDate(booking.getCheckInDate());
        return responseDto;
    }

    private Room_ from(RoomRequestDto roomRequestDto) {
        Room_ room = new Room_();
        room.setRoomType(roomRequestDto.getRoomType());
        if(roomRequestDto.getRoomType().equals(RoomType_.DELUXE)) {
            room.setRent(1000D * roomRequestDto.getRoomCount());
        }else if(roomRequestDto.getRoomType().equals(RoomType_.SUPER_DELUXE)) {
            room.setRent(1500D * roomRequestDto.getRoomCount());
        }else if(roomRequestDto.getRoomType().equals(RoomType_.SUITE)) {
            room.setRent(2500D * roomRequestDto.getRoomCount());
        }

        return room;
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
