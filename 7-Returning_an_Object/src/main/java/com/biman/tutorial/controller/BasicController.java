package com.biman.tutorial.controller;

import com.biman.tutorial.model.CalculationObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    // http://localhost:9090/operation/sum?a=10&b=20
    // http://localhost:9090/operation/sub?a=10&b=20
    // http://localhost:9090/operation/mul?a=10&b=20
    // http://localhost:9090/operation/div?a=20&b=10
    // http://localhost:9090/operation/asdfasdfasdf?a=10&b=20
    @GetMapping("/operation/{operationType}")
    public ResponseEntity<CalculationObject> performOperation(@PathVariable String operationType, @RequestParam int a, @RequestParam int b) {
        CalculationObject calculationObject = new CalculationObject();

        switch (operationType) {
            case "sum":
                calculationObject.setOperationType("Addition");
                calculationObject.setResult(a + b);
                break;
            case "sub":
                calculationObject.setOperationType("Subtraction");
                calculationObject.setResult(a - b);
                break;
            case "mul":
                calculationObject.setOperationType("Multiplication");
                calculationObject.setResult(a * b);
                break;
            case "div":
                calculationObject.setOperationType("Division");
                calculationObject.setResult(a / b);
                break;
            default:
                calculationObject.setOperationType("wrong_operation");
                calculationObject.setResult(0);
                return ResponseEntity.badRequest().body(calculationObject);
        }

        return ResponseEntity.ok(calculationObject);
    }
}
