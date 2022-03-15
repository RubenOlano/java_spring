package com.ruben.java_spring;

import com.ruben.java_spring.student.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class JavaSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringApplication.class, args);
    }

}
