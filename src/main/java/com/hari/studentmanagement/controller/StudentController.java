package com.hari.studentmanagement.controller;

import com.hari.studentmanagement.entity.Student;
import com.hari.studentmanagement.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
       return studentService.getAllStudents();

    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
    }

}
