package com.biman.tutorial.controller;

import com.biman.tutorial.model.Student;
import com.biman.tutorial.service.StudentDatabaseService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path = {"/web","/"})
public class StudentWebController {

  @Autowired
  StudentDatabaseService studentDatabaseService;

  @RequestMapping
  public String getAllStudents(Model model) {
    List<Student> students = studentDatabaseService.students();
    model.addAttribute("students", students);
    return "list-students";
  }

  @RequestMapping(path = {"/update", "/update/{id}"})
  public String editStudent(Model model, @PathVariable("id") Optional<Integer> id){
    if (id.isPresent()) {
      Student student = studentDatabaseService.getStudentById(id.get());
      model.addAttribute("student", student);
    } else {
      model.addAttribute("student", new Student());
    }
    return "add-edit-student";
  }

  @RequestMapping(path = {"/delete/{id}"})
  public String deleteStudent(Model model, @PathVariable("id") int deleteId) {
    studentDatabaseService.deleteStudents(deleteId);
    return "redirect:/web";
  }

  @RequestMapping(path = {"/create"}, method = RequestMethod.POST)
  public String createOrUpdateStudent(Student student){
    studentDatabaseService.addStudent(student);
    return "redirect:/web";
  }

}
