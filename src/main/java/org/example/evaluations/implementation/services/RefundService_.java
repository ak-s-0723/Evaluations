package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.clients.RazorpayPaymentGatewayClient_;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefundService_ implements IRefundService_ {

    @Autowired
    private RazorpayPaymentGatewayClient_ razorpayPaymentGatewayClient;

    public String issueRefund(Double amount, String receipt) {
        return razorpayPaymentGatewayClient.issueInstantRefund(amount,receipt);
    }

    public String updateRefund(String refundId, JSONObject jsonObject) {
       return razorpayPaymentGatewayClient.updateRefund(refundId,jsonObject);
    }
}
