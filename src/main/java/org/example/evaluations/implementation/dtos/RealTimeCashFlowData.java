package org.example.evaluations.implementation.dtos;

import lombok.Data;
import org.example.evaluations.implementation.models.CashFlow;

import java.util.List;

@Data
public class RealTimeCashFlowData {
    private List<CashFlow> cash_flow;
}
