package com.biman.tutorials.controller;

import com.biman.tutorials.model.OperationContainer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    /*
    Use Postman to send the request
    http://localhost:9090/adds
    request_body : { "operation_type" : "sum" , "numbers" : [ 1, 2, 3, 4, 5 ] }
     */
    @PostMapping("/adds")
    ResponseEntity addMultipleNumbers(@RequestBody OperationContainer operationContainer){
        if (operationContainer.getOperation_type().equalsIgnoreCase("sum")){
            int sum = 0;
            for (int num:  operationContainer.getNumbers()){
                sum += num;
            }
            return ResponseEntity.ok(sum);
        }   else {
            return ResponseEntity.badRequest().body("Operation Type not supported");
        }
    }
}
