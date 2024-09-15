package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class WebhookDto {
    String url;
    List<String> events;
}
