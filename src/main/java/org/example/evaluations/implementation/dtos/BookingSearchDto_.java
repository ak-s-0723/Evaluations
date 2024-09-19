package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class BookingSearchDto_ {
    private String guestEmail;
    private Integer pageNumber;
    private Integer pageSize;
    private String guestFirstName;
    private String guestLastName;
    private Long roomNumber;
    private Date bookingDate;
}
