package org.example.evaluations.implementation.services;

import org.json.JSONObject;

public interface IRefundService_ {
    String issueRefund(Double amount, String receipt);
    String updateRefund(String refundId, JSONObject jsonObject);
}
