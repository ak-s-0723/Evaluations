package org.example.evaluations.services;

import org.example.evaluations.evaluation.dtos.BookingResponseDto;
import org.example.evaluations.evaluation.models.Booking;
import org.example.evaluations.evaluation.models.Guest;
import org.example.evaluations.evaluation.models.Room;
import org.example.evaluations.evaluation.models.RoomType;
import org.example.evaluations.evaluation.repos.BookingRepo;
import org.example.evaluations.evaluation.repos.RoomRepo;
import org.example.evaluations.evaluation.repos.GuestRepo;
import org.example.evaluations.evaluation.dtos.BookingRequestDto;
import org.example.evaluations.evaluation.dtos.RoomRequestDto;

import org.example.evaluations.evaluation.services.StorageBookingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@SpringBootTest
public class StorageBookingServiceTest {

    @Autowired
    private StorageBookingService storageBookingService;

    @MockBean
    private BookingRepo bookingRepo;

    @MockBean
    private RoomRepo roomRepo;

    @MockBean
    private GuestRepo guestRepo;


    @Test
    public void testGetBooking() {
        Booking booking = new Booking();
        booking.setId(1L);
        when(bookingRepo.findById(anyLong())).thenReturn(Optional.of(booking));

        BookingResponseDto responseDto = storageBookingService.getBooking(1L);

        assertNotNull(responseDto);
        assertEquals(1L,responseDto.getBookingId());
        verify(bookingRepo, times(1)).findById(anyLong());
    }

    @Test
    public void testGetAllBookingsPerGuest() {
        Guest guest = new Guest();
        guest.setEmail("test@example.com");

        Booking booking = new Booking();
        booking.setId(1L);
        List<Booking> bookings = Collections.singletonList(booking);

        when(guestRepo.findByEmail(anyString())).thenReturn(Optional.of(guest));
        when(bookingRepo.findBookingsByGuest(any(Guest.class))).thenReturn(bookings);

        List<BookingResponseDto> responseDtos = storageBookingService.getAllBookingsPerGuest("test@example.com");

        assertNotNull(responseDtos);
        assertEquals(1, responseDtos.size());
        assertEquals(1L,responseDtos.get(0).getBookingId());
        verify(guestRepo, times(1)).findByEmail(anyString());
        verify(bookingRepo, times(1)).findBookingsByGuest(any(Guest.class));
    }

    @Test
    public void testReplaceBooking() {
        RoomRequestDto roomRequestDto = new RoomRequestDto();
        roomRequestDto.setRoomCount(2);
        roomRequestDto.setRoomType(RoomType.DELUXE);
        List<RoomRequestDto> rooms = new ArrayList<>();
        rooms.add(roomRequestDto);
        BookingRequestDto bookingRequest = new BookingRequestDto("guest2","guest2",rooms,"2024-10-10","2024-10-15");
        Booking existingBooking = new Booking();
        existingBooking.setId(1L);
        when(bookingRepo.findById(anyLong())).thenReturn(Optional.of(existingBooking));

        BookingResponseDto responseDto = storageBookingService.replaceBooking(1L, bookingRequest);

        assertNotNull(responseDto);
        assertNotNull(responseDto);
        assertNotNull(responseDto.getGuest().getName());
        assertNotNull(responseDto.getCheckInDate());
        assertNotNull(responseDto.getCheckOutDate());
        assertNotNull(responseDto.getTotalBill());
        assertNotNull(responseDto.getRooms());
        assertEquals(1,responseDto.getRooms().size());
        assertEquals(RoomType.DELUXE,responseDto.getRooms().get(0).getRoomType());
        assertEquals("guest2",responseDto.getGuest().getEmail());
        assertEquals("guest2",responseDto.getGuest().getName());
        verify(bookingRepo, times(1)).findById(anyLong());
        verify(bookingRepo, times(1)).deleteById(anyLong());
        verify(bookingRepo, times(1)).save(any(Booking.class));
        verify(roomRepo, times(1)).save(any(Room.class));
    }

    @Test
    public void testCreateBooking() {
        RoomRequestDto roomRequestDto = new RoomRequestDto();
        roomRequestDto.setRoomCount(2);
        roomRequestDto.setRoomType(RoomType.DELUXE);
        List<RoomRequestDto> rooms = new ArrayList<>();
        rooms.add(roomRequestDto);
        BookingRequestDto bookingRequest = new BookingRequestDto("guest2","guest2",rooms,"2024-10-10","2024-10-15");

        when(bookingRepo.save(any(Booking.class))).thenReturn(new Booking());
        when(roomRepo.save(any(Room.class))).thenReturn(new Room());

        BookingResponseDto responseDto = storageBookingService.createBooking(bookingRequest);

        assertNotNull(responseDto);
        assertNotNull(responseDto.getGuest().getName());
        assertNotNull(responseDto.getCheckInDate());
        assertNotNull(responseDto.getCheckOutDate());
        assertNotNull(responseDto.getTotalBill());
        assertNotNull(responseDto.getRooms());
        assertEquals(1,responseDto.getRooms().size());
        assertEquals(RoomType.DELUXE,responseDto.getRooms().get(0).getRoomType());
        assertEquals("guest2",responseDto.getGuest().getEmail());
        verify(bookingRepo, times(1)).save(any(Booking.class));
        verify(roomRepo, times(1)).save(any(Room.class));
    }

    @Test
    public void testDeleteBooking() {
        Booking booking = new Booking();
        booking.setId(1L);
        when(bookingRepo.findById(anyLong())).thenReturn(Optional.of(booking));
        doNothing().when(bookingRepo).deleteById(anyLong());

        Boolean result = storageBookingService.deleteBooking(1L);

        assertTrue(result);
        verify(bookingRepo, times(1)).deleteById(anyLong());
    }

    @Test
    public void testDeleteNonExistentBooking() {
        when(bookingRepo.findById(anyLong())).thenReturn(Optional.empty());

        Boolean result = storageBookingService.deleteBooking(1L);

        assertFalse(result);
        verify(bookingRepo, times(0)).deleteById(anyLong());
    }
}
