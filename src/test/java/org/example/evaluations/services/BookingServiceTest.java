package org.example.evaluations.services;

import org.example.evaluations.evaluation.models.Booking;
import org.example.evaluations.evaluation.models.Guest;
import org.example.evaluations.evaluation.models.Room;
import org.example.evaluations.evaluation.models.RoomType;
import org.example.evaluations.evaluation.repos.BookingRepository;
import org.example.evaluations.evaluation.repos.GuestRepository;
import org.example.evaluations.evaluation.repos.RoomRepository;
import org.example.evaluations.evaluation.services.BookingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BookingServiceTest {

    @Autowired
    private BookingService bookingService;

    @MockBean
    private RoomRepository roomRepository;

    @MockBean
    private BookingRepository bookingRepository;

    @MockBean
    private GuestRepository guestRepository;


    @Test
    public void testGetAllBookingDoneByGuest() {
        // Arrange
        String guestEmail = "guest@example.com";
        Integer pageNumber = 0;
        Integer pageSize = 5;

        Guest guest = createGuest(guestEmail);
        Booking booking1 = createBooking();
        Booking booking2 = createBooking();
        List<Booking> bookings = Arrays.asList(booking1, booking2);
        Page<Booking> bookingPage = new PageImpl<>(bookings, PageRequest.of(pageNumber, pageSize), bookings.size());

        when(guestRepository.findById(guestEmail)).thenReturn(Optional.of(guest));
        when(bookingRepository.findBookingsByGuest(guest, PageRequest.of(pageNumber, pageSize))).thenReturn(bookingPage);

        // Act
        Page<Booking> result = bookingService.getAllBookingDoneByGuest(guestEmail, pageNumber, pageSize);

        // Assert
        assertEquals(2, result.getContent().size());
        assertEquals(booking1.getId(), result.getContent().get(0).getId());
    }

    @Test
    public void testGetAllBookingsOnDateWhenMayorIsStaying() {
        // Arrange
        String firstName = "John";
        String lastName = "Doe";
        Integer pageNumber = 0;
        Integer pageSize = 5;

        Guest guest = createGuest("mayor@example.com");
        Booking booking = createBooking();
        guest.setBookings(Arrays.asList(booking));

        when(guestRepository.findGuestByFirstNameAndLastName(firstName, lastName)).thenReturn(Optional.of(guest));
        when(bookingRepository.findBookingByDate(booking.getDate(), PageRequest.of(pageNumber, pageSize)))
                .thenReturn(new PageImpl<>(Arrays.asList(booking), PageRequest.of(pageNumber, pageSize), 1));

        // Act
        Page<Booking> result = bookingService.getAllBookingsOnDateWhenMayorIsStaying(firstName, lastName, pageNumber, pageSize);

        // Assert
        assertEquals(1, result.getContent().size());
        assertEquals(booking.getId(), result.getContent().get(0).getId());
    }

    @Test
    public void testGetAllBookingsDoneForRoomOnParticularDate() {
        // Arrange
        Long roomNumber = 1L;
        Date date = new Date();
        Integer pageNumber = 0;
        Integer pageSize = 5;

        Room room = createRoom(roomNumber);
        Booking booking = createBooking();
        when(roomRepository.findById(roomNumber)).thenReturn(Optional.of(room));
        when(bookingRepository.findBookingByRoomsAndDate(room, date, PageRequest.of(pageNumber, pageSize)))
                .thenReturn(new PageImpl<>(Arrays.asList(booking), PageRequest.of(pageNumber, pageSize), 1));

        // Act
        Page<Booking> result = bookingService.getAllBookingsDoneForRoomOnParticularDate(roomNumber, date, pageNumber, pageSize);

        // Assert
        assertEquals(1, result.getContent().size());
        assertEquals(booking.getId(), result.getContent().get(0).getId());
    }

    private Guest createGuest(String emailId) {
        Guest guest = new Guest();
        guest.setEmailId(emailId);
        guest.setFirstName("John");
        guest.setLastName("Doe");
        return guest;
    }

    private Booking createBooking() {
        Booking booking = new Booking();
        booking.setId(UUID.randomUUID());
        booking.setDate(new Date());
        return booking;
    }

    private Room createRoom(Long id) {
        Room room = new Room();
        room.setId(id);
        room.setRoomType(RoomType.DELUXE);
        return room;
    }
}
