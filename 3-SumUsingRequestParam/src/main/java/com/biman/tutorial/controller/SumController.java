package com.biman.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    // http://localhost:9090/sum?a=10&b=20
    @GetMapping("/sum")
    public int sum(@RequestParam int a , @RequestParam int b){
        return a+b;
    }
}
