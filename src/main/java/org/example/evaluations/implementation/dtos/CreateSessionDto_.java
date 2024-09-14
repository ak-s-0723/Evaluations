package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CreateSessionDto_ {
    List<Long> amounts;
    List<Long> quantities;
    String successUrl;
    List<String> productNames;
}
