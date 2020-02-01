package com.biman.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    // http://localhost:9090/sum/10/15
    @GetMapping("/sum/{a}/{b}")
    public int sum(@PathVariable int a , @PathVariable int b){
        return a+b;
    }
}
