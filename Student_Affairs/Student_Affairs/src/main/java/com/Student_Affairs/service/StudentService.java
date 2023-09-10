package com.Student_Affairs.service;

import com.Student_Affairs.model.Student;

import java.util.List;

public interface StudentService {

     Student saveStudent(Student student);
     Student findById(Long id);
     List<Student> findAll();
     void deleteById(Long id);
     void updateStudent(Student student,Long id);




}
