package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.CashFlow;
import org.example.evaluations.implementation.models.News;

import java.util.List;

public interface IStockService {
    List<News> getStockNews(String symbol);
    List<CashFlow> getCompanyCashFlow(String symbol);
}
