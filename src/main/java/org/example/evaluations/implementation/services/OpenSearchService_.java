package org.example.evaluations.implementation.services;

import org.antlr.v4.runtime.misc.Pair;
import org.example.evaluations.implementation.models.Flight_;
import org.example.evaluations.implementation.repos.FlightRepository_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class OpenSearchService_ {

    @Autowired
    private FlightRepository_ flightRepository;

    public Page<Flight_> getFlightsMatchingSearchQuery(String query, Integer pageSize, Integer pageNumber) {
        try {
            Time time = Time.valueOf(query);
            Pair<Time, Time> timeWindow = getTimeWindow(time);
            List<Flight_> flightsMatchedByTime = flightRepository.findFlightByTimeBetween(timeWindow.a, timeWindow.b);
            List<List<Flight_>> flightEntriesMatchingDifferentCriteria = new ArrayList<>();
            flightEntriesMatchingDifferentCriteria.add(flightsMatchedByTime);
            return mergeListsIntoPage(flightEntriesMatchingDifferentCriteria, PageRequest.of(pageNumber, pageSize));
        }catch (IllegalArgumentException exception) {

            List<Flight_> flightsMatchedByAirlinesName = flightRepository.findFlightByAirlinesName(query);
            List<Flight_> flightsMatchedByFlightId = flightRepository.findFlightByFlightIdLike(query);
            List<Flight_> flightsMatchedBySource = flightRepository.findFlightBySourceLike(query);
            List<Flight_> flightsMatchByDestination = flightRepository.findFlightByDestinationLike(query);
            List<Flight_> flightsMatchedByStop = flightRepository.findFlightByStopLike(query);

            List<List<Flight_>> flightEntriesMatchingDifferentCriteria = new ArrayList<>();
            flightEntriesMatchingDifferentCriteria.add(flightsMatchedByAirlinesName);
            flightEntriesMatchingDifferentCriteria.add(flightsMatchedBySource);
            flightEntriesMatchingDifferentCriteria.add(flightsMatchByDestination);
            flightEntriesMatchingDifferentCriteria.add(flightsMatchedByStop);
            flightEntriesMatchingDifferentCriteria.add(flightsMatchedByFlightId);
            return mergeListsIntoPage(flightEntriesMatchingDifferentCriteria, PageRequest.of(pageNumber, pageSize));
        }
    }

    private Pair<Time,Time> getTimeWindow(Time time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);

        calendar.add(Calendar.HOUR_OF_DAY, -3);
        Time startTime = new Time(calendar.getTimeInMillis());

        calendar.add(Calendar.HOUR_OF_DAY, 6);
        Time endTime = new Time(calendar.getTimeInMillis());

        return new Pair<>(startTime,endTime);
    }

    private static <T> Page<T> mergeListsIntoPage(List<List<T>> lists, Pageable pageable) {
        List<T> mergedContent = new ArrayList<>();

        for (List<T> list : lists) {
            if (list != null) {
                mergedContent.addAll(list);
            }
        }

        return new PageImpl<>(mergedContent, pageable, mergedContent.size());
    }
}
