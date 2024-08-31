package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.dtos.BookingRequestDto;
import org.example.evaluations.evaluation.dtos.BookingResponseDto;
import org.example.evaluations.evaluation.dtos.RoomRequestDto;
import org.example.evaluations.evaluation.models.Booking;
import org.example.evaluations.evaluation.models.Room;
import org.example.evaluations.evaluation.models.RoomType;
import org.example.evaluations.evaluation.repos.BookingRepo;
import org.example.evaluations.evaluation.repos.RoomRepo;
import org.example.evaluations.evaluation.repos.GuestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class StorageBookingService implements IBookingService {

    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
    private GuestRepo guestRepo;

    @Autowired
    private RoomRepo roomRepo;


    @Override
    public BookingResponseDto getBooking(Long bookingId) {
        return null;
    }

    @Override
    public List<BookingResponseDto> getAllBookingsPerGuest(String guestEmail) {
       return null;
    }

    @Override
    public BookingResponseDto replaceBooking(Long bookingId, BookingRequestDto bookingRequestDto) {
        return null;
    }

    @Override
    public BookingResponseDto createBooking(BookingRequestDto bookingRequestDto) {
        return null;
    }

    @Override
    public Boolean deleteBooking(Long bookingId) {
       return null;
    }

    private BookingResponseDto from(Booking booking) {
        BookingResponseDto responseDto = new BookingResponseDto();
        responseDto.setBookingId(booking.getId());
        responseDto.setRooms(booking.getRooms());
        responseDto.setGuest(booking.getGuest());
        responseDto.setTotalBill(booking.getTotalBill());
        responseDto.setCheckOutDate(booking.getCheckOutDate());
        responseDto.setCheckInDate(booking.getCheckInDate());
        return responseDto;
    }

    private Room from(RoomRequestDto roomRequestDto) {
        Room room = new Room();
        room.setRoomType(roomRequestDto.getRoomType());
        if(roomRequestDto.getRoomType().equals(RoomType.DELUXE)) {
            room.setRent(1000D * roomRequestDto.getRoomCount());
        }else if(roomRequestDto.getRoomType().equals(RoomType.SUPER_DELUXE)) {
            room.setRent(1500D * roomRequestDto.getRoomCount());
        }else if(roomRequestDto.getRoomType().equals(RoomType.SUITE)) {
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
