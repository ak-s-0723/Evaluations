package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.News;

import java.util.List;

public interface ICurrencyService {
    List<News> getCurrencyNews(String fromCurrency, String toCurrency);
}
