package com.Student_Affairs.repository;

import com.Student_Affairs.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>
{


}
