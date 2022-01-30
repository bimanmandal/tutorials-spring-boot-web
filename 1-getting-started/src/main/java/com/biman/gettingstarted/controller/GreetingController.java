package com.biman.gettingstarted.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GreetingController {
    @CrossOrigin(origins = "*")
    @GetMapping("/hello")
    public String greeting(@RequestParam String name){
        return "Hello "+ name;
    }

    @GetMapping("/college")
    public List<String> getStudents() {
        List<String> students =  new ArrayList<>();
        students.add("Sourav");
        students.add("Ishan");
        students.add("Debojit");
        return students;
    }

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/uppercase")
    public String upper(@RequestParam String str) {
        return str.toUpperCase();
    }
}
