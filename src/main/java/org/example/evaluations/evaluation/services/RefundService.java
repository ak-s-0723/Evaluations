package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.clients.RazorpayPaymentGatewayClient;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefundService implements IRefundService {

    @Autowired
    private RazorpayPaymentGatewayClient razorpayPaymentGatewayClient;

    public String issueRefund(Double amount, String receipt) {
       return null;
    }

    public String updateRefund(String refundId, JSONObject jsonObject) {
       return null;
    }
}
