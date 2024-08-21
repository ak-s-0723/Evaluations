package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.CashFlow;
import org.example.evaluations.evaluation.models.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyStockService implements IStockService {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    public List<News> getStockNews(String symbol) {
        //Add your implementation here
        return null;
    }

    public List<CashFlow> getCompanyCashFlow(String symbol) {
        //Add your implementation here
        return null;
    }
}
