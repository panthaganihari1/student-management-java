package com.hari.studentmanagement.service.impl;

import com.hari.studentmanagement.dao.StudentRepo;
import com.hari.studentmanagement.entity.Student;
import com.hari.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
   private StudentRepo studentRepo;

    @Override
    public void saveStudent(Student student) {
    studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList= studentRepo.findAll();
        return studentList;
    }

    @Override
    public void deleteStudentById(Long id) {
       Optional<Student> student = studentRepo.findById(id);
       Student student1=student.get();
       studentRepo.delete(student1);

    }
}
