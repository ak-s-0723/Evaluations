package org.example.evaluations.evaluation.clients;

import com.razorpay.RazorpayClient;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RazorpayPaymentGatewayClient {

    @Autowired
    private RazorpayClient razorpayClient;

    private final String paymentId = "pay_39QqoUAi66xm2f"; //use this paymentId, wherever needed

    public String issueInstantRefund(Double amount, String receipt) {
        return null;
    }

    public String updateRefund(String refundId,JSONObject jsonObject) {
        return null;
    }
}
