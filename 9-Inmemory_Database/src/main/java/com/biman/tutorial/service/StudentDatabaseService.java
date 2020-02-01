package com.biman.tutorial.service;

import com.biman.tutorial.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StudentDatabaseService {
    private final List<Student> students = new ArrayList<>();

    public List<Student> students() {
        return Collections.unmodifiableList(students);
    }

    public void addStudent(Student student){
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
