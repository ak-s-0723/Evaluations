package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.PayoutRequestDto_;
import org.example.evaluations.implementation.services.IPayoutService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayoutController_ {

    @Autowired
    private IPayoutService_ payoutService;

    @PostMapping("/payout_")
    public String createPayoutToBank(@RequestBody PayoutRequestDto_ payoutRequestDto) {
        return payoutService.createPayoutToBankAccount(payoutRequestDto.getAccountNumber(),payoutRequestDto.getAmount(),payoutRequestDto.getPurpose(),payoutRequestDto.getReferenceId(),payoutRequestDto.getNarration());
    }
}
