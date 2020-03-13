package com.biman.tutorial.service;

import com.biman.tutorial.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentDatabaseService {
  private final List<Student> students = new ArrayList<>();

  public List<Student> students() {
    return Collections.unmodifiableList(students);
  }

  public Student getStudentById(int id) {
    return students.stream().filter(stu -> stu.getId() == id).findFirst().orElseGet(() -> new Student());
  }

  public void addStudent(Student student){
    students.removeIf(stu -> stu.getId() == student.getId());
    students.add(student);
  }

  public Boolean deleteStudents(int id){
    return students.removeIf(student -> student.getId() == id);
  }

  public void updateStudents(int id, Student updatedStudent){
    students.removeIf(student -> student.getId() == id);
    updatedStudent.setId(id);
    students.add(updatedStudent);
  }
}
