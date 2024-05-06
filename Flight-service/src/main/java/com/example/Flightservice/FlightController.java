package com.example.Flightservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FlightController {

    @GetMapping("/")
    public String bookFlight(){
        return "the book flight " ;
    }
}
