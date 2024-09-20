package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Flight_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.List;


@Repository
public interface FlightRepository_ extends JpaRepository<Flight_,String> {

    List<Flight_> findFlightByAirlinesName(String airlinesName);

    List<Flight_> findFlightByFlightIdLike(String flightId);

    List<Flight_> findFlightBySourceLike(String source);

    List<Flight_> findFlightByDestinationLike(String destination);

    List<Flight_> findFlightByStopLike(String stop);

    List<Flight_> findFlightByTimeBetween(Time time1, Time time2);
}
