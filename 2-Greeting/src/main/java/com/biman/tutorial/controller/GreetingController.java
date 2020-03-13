package com.biman.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {



    // http://localhost:9090/hello?name=<name>
    @GetMapping("/hello")
    public String greetingMethod(@RequestParam String name) {
        return "Hello "+ name;
    }
}
