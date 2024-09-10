package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RefundRequestDto_ {
    Double amount;
    String receipt;
    RefundSpeed_ refundSpeed;
}
