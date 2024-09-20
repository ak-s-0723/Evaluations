package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.Flight;
import org.example.evaluations.evaluation.repos.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class OpenSearchService {

    @Autowired
    private FlightRepository flightRepository;

    public Page<Flight> getFlightsMatchingSearchQuery(String query,Integer pageSize,Integer pageNumber) {
        return null;
    }
}
