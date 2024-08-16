package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class InventoryUpdateRequestDto {
    private String guestName;

    private Date date;
}
