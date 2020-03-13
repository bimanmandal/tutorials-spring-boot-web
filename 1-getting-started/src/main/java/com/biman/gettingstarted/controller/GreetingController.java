package com.biman.gettingstarted.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @CrossOrigin(origins = "*")
    @GetMapping("/hello")
    public String greeting(@RequestParam String name){
        return "Hello "+ name;
    }
}
