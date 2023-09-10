package com.Student_Affairs.controller;

import com.Student_Affairs.model.Student;
import com.Student_Affairs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public Student save_Student(@RequestBody  Student student)
    {
        return  studentService.saveStudent(student);
    }

    @GetMapping("/findStudent/{id}")
    public Student findStudent(@PathVariable("id") Long id)
    {
        return  studentService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Student> findAll()
    {
        return studentService.findAll();
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id)
    {
        studentService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public void updateStudent(@RequestBody Student student,@PathVariable("id") Long id)
    {
        studentService.updateStudent(student,id);
    }




}
