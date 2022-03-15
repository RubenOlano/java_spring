package com.ruben.java_spring.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Ruben", "ruben@gmail.com", LocalDate.of(2001, 11, 27), 20)
        );
    }
}
