package org.example.evaluations.implementation.dtos;

import lombok.Data;
import org.example.evaluations.implementation.models.Guest_;
import org.example.evaluations.implementation.models.Room_;

import java.util.Date;
import java.util.List;

@Data
public class BookingResponseDto {
    private Long bookingId;

    private Double totalBill;

    private Guest_ guest;

    private List<Room_> rooms;

    private Date checkInDate;

    private Date checkOutDate;
}
