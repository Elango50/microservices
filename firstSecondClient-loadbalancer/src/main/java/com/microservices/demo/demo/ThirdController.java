package com.microservices.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ThirdController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/greeting")
    public String greetingService(@RequestParam(value = "message", required = true) String message) {
        System.out.print("greeting service called");
        return restTemplate.getForObject("https://first-service/greeting?message=SUCCESS",String.class)
                + " you successfully called a first service via third service..........";
    }

}
