package com.biman.tutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntroductoryController {

    // http://localhost:9090/hello
    @GetMapping("/hello")
    ResponseEntity greeting(){
        return ResponseEntity.ok("Hello Bangalore");
    }

    // http://localhost:9090/sum?a=10&b=20
    @GetMapping("/sum")
    ResponseEntity sum(@RequestParam int a, @RequestParam int b){
        return ResponseEntity.ok(a+b);
    }
}
