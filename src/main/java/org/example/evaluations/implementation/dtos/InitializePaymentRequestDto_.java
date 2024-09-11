package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InitializePaymentRequestDto_ {
    Long amount;
    Long quantity;
    String callbackUrl;
    String productName;
}
