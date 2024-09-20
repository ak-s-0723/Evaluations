package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.models.Flight_;
import org.example.evaluations.implementation.services.OpenSearchService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


@RestController
public class SearchController_ {

    @Autowired
    private OpenSearchService_ openSearchService;

    @GetMapping("/search_/{query}")
    public Page<Flight_> getFlightsMatchingSearchQuery(@PathVariable String query, @RequestParam Integer pageSize, @RequestParam Integer pageNumber) {
        return openSearchService.getFlightsMatchingSearchQuery(query,pageSize,pageNumber);
    }
}
