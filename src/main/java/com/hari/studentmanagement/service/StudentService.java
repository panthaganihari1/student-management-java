package com.hari.studentmanagement.service;

import com.hari.studentmanagement.entity.Student;

import java.util.List;

public interface StudentService {

    void saveStudent(Student student);

    List<Student> getAllStudents();

    void deleteStudentById(Long id);
}
