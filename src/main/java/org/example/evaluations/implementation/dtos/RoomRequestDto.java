package org.example.evaluations.implementation.dtos;

import lombok.Data;
import org.example.evaluations.implementation.models.RoomType_;

@Data
public class RoomRequestDto {
    RoomType_ roomType;
    int roomCount;
}
