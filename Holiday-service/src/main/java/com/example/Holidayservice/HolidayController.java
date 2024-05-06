package com.example.Holidayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class HolidayController {

    private final RestTemplate restTemplate ;

    public HolidayController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }



    @GetMapping("/")
    public String BookHoliday(){
       StringBuilder finalResponse = new StringBuilder() ;
        String flightResponse = restTemplate.getForObject("http://FLIGHT-SERVICE/api/v1/" , String.class) ;
        finalResponse.append(flightResponse) ;
        String paymentResponse = restTemplate.getForObject("http://PAYMENT-SERVICE/api/v1/" , String.class) ;
        finalResponse.append(paymentResponse) ;

        return finalResponse.toString() ;
    }
}
