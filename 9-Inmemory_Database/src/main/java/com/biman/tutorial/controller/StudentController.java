package com.biman.tutorial.controller;

import com.biman.tutorial.model.Student;
import com.biman.tutorial.service.StudentDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

  @Autowired
  StudentDatabaseService studentDatabaseService;

  /*
  http://localhost:9090/add
      body = {
            "id" : 2,
            "name" : "Biman",
            "score" : 20
      }
   */
  @PostMapping("/add")
  ResponseEntity addStudents(@RequestBody Student student) {
    studentDatabaseService.addStudent(student);
    return ResponseEntity.ok("Student Added Successfully!");
  }

  // http://localhost:9090/delete?id=5
  @DeleteMapping("/delete")
  ResponseEntity deleteStudents(@RequestParam int id) {
    if (studentDatabaseService.deleteStudents(id)) {
      return ResponseEntity.ok("Student Deleted Successfully!");
    } else {
      return ResponseEntity.badRequest().body("Student doesn't exists");
    }
  }

  /*
  http://localhost:9090/update?id=1
  body = {
    "id" : 1,
    "name" : "Sanjay",
    "score" : 20
  }
   */
  @PutMapping("/update")
  ResponseEntity updateStudents(@RequestParam int id, @RequestBody Student updatedStudent) {
    studentDatabaseService.updateStudents(id, updatedStudent);
    return ResponseEntity.ok("Students Updated Successfully!");
  }

  // http://localhost:9090/list
  @GetMapping("/list")
  ResponseEntity listStudents() {
    List<Student> students = studentDatabaseService.students();
    return ResponseEntity.ok(students);
  }
}
