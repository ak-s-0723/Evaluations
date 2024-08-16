package org.example.evaluations.implementation.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Inventory {
    private Long id = 99999L;

    private String guestName = "Your Name";

    private Date date = new Date();
}
