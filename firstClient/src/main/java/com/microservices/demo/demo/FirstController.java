package com.microservices.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/greeting")
    public String greetingService(String message) {
        return "Hello " + message + " you successfully called a first service..........";
    }

}
