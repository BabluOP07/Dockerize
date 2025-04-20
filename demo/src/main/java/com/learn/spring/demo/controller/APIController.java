package com.learn.spring.demo.controller;

import com.learn.spring.demo.model.Drivers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class APIController {
    @GetMapping("/health")
    public String healthCheck(){
        return "Spring Boot is running";
    }

    @GetMapping("/alldrivers")
    public List<Drivers> getAllDrivers() {
        List<Drivers> drivers = new ArrayList<>();

        drivers.add(new Drivers("Lewis Hamilton", "Ferrari"));

        drivers.add(new Drivers("Max Verstappen", "Red Bull Racing"));

        drivers.add(new Drivers("Charles Leclerc", "Ferrari"));

        drivers.add(new Drivers("Sebastian Vettel", "Aston Martin"));

        drivers.add(new Drivers("Yuki Tsunoda", "Red Bull Racing"));

        return drivers;
    }
}
