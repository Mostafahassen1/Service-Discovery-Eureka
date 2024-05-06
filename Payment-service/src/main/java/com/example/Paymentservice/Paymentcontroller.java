package com.example.Paymentservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class Paymentcontroller {

    @GetMapping("/")
    public String bookPayment(){
        return "  the book payment" ;
    }
}
