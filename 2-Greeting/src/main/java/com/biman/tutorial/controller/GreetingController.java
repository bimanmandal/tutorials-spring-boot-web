package com.biman.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // http://localhost:9090/hello
    @GetMapping("/hello")
    public String greetingMethod(){
        return "Hello Bangalore";
    }
}
