package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.models.News;
import org.example.evaluations.implementation.services.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/currency_")
public class Currency_Controller {

    @Autowired
    private ICurrencyService currencyService;

    //localhost:8080/currency_/conversionNews?from_symbol=USD&to_symbol=INR
    @GetMapping("/conversionNews")
    public List<News> getCurrencyNews(@RequestParam(required = true) String from_symbol, @RequestParam(required = true) String to_symbol) {
        return currencyService.getCurrencyNews(from_symbol,to_symbol);
    }
}
