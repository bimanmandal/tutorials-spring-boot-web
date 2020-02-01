package com.biman.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {


    // http://localhost:9090/operation/sum?a=10&b=20
    // http://localhost:9090/operation/sub?a=10&b=20
    // http://localhost:9090/operation/mul?a=10&b=20
    // http://localhost:9090/operation/div?a=20&b=10
    // http://localhost:9090/operation/asdfasdfasdf?a=10&b=20
    @GetMapping("/operation/{operationType}")
    public int performOperation(@PathVariable String operationType, @RequestParam int a, @RequestParam int b) {
        switch (operationType) {
            case "sum":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                return a / b;
            default:
                return 0;
        }
    }
}
