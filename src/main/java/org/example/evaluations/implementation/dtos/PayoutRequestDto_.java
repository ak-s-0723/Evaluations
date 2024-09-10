package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PayoutRequestDto_ {
    String accountNumber;
    Double amount;
    PayoutPurpose_ purpose;
    String referenceId;
    String narration;
}
