package com.Student_Affairs.service.implementation;

import com.Student_Affairs.exception.ResourceNotFoundException;
import com.Student_Affairs.model.Student;
import com.Student_Affairs.repository.StudentRepository;
import com.Student_Affairs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }

    @Override
    public Student findById(Long id)
    {
        return studentRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Student","id",id));
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);

    }
    @Override
    public void updateStudent(Student student,Long id) {

        Student newStudent=studentRepository.findById(id).get();
        newStudent.setFirstName(student.getFirstName());
        newStudent.setLastName(student.getLastName());
        newStudent.setDepartment(student.getDepartment());
        newStudent.setGpa(student.getGpa());
      //  newStudent.setStatus(student.getStatus());
        newStudent.setStatus(student.isStatus());

        studentRepository.save(newStudent);

    }
}
