package com.example.lab_airline_API.services;

import com.example.lab_airline_API.models.Flight;
import com.example.lab_airline_API.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public Flight addNewFlight(Flight flight) {
        flightRepository.save(flight);
        return flight;
    }
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Optional<Flight> getFlightById(Long id) {
        return flightRepository.findById(id);
    }
}
