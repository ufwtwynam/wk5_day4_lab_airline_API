package com.example.lab_airline_API.services;

import com.example.lab_airline_API.models.Passenger;
import com.example.lab_airline_API.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    public Passenger addNewPassenger(Passenger passenger) {
        passengerRepository.save(passenger);
        return passenger;
    }
    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public Optional<Passenger> getPassengerById(Long id) {
        return passengerRepository.findById(id);
    }
}
