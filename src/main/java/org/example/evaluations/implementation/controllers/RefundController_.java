package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.RefundRequestDto_;
import org.example.evaluations.implementation.services.IRefundService_;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RefundController_ {

    @Autowired
    private IRefundService_ refundService;

    @PostMapping("/issueRefund_")
    public String issueRefund(@RequestBody RefundRequestDto_ refundRequestDto) {
      return refundService.issueRefund(refundRequestDto.getAmount(), refundRequestDto.getReceipt());
    }

    @PatchMapping("/updateRefund_/{refundId}")
    public String updateRefund(@PathVariable String refundId, @RequestBody RefundRequestDto_ refundRequestDto) {
        JSONObject jsonObject = new JSONObject();
        if (refundRequestDto != null) {
            if (refundRequestDto.getAmount() != null) {
                jsonObject.put("amount", refundRequestDto.getAmount());
            }

            if (refundRequestDto.getReceipt() != null) {
                jsonObject.put("receipt", refundRequestDto.getReceipt());
            }

            if (refundRequestDto.getRefundSpeed() != null) {
                jsonObject.put("speed", refundRequestDto.getRefundSpeed().name());
            }
        }
        return refundService.updateRefund(refundId, jsonObject);
    }
}
