package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NotificationRequestDto {
    private String sender;
    private String recipient;
}
