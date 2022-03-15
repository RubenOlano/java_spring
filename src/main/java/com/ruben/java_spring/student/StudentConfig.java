package com.ruben.java_spring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student ruben = new Student(
                    1L,
                    "Ruben",
                    "ruben@gmail.com",
                    LocalDate.of(2001, NOVEMBER, 27));
            Student ana = new Student(
                    2L,
                    "Ana",
                    "Ana@gmail.com",
                    LocalDate.of(2000, SEPTEMBER, 12));
            
            repository.saveAll(List.of(ruben, ana));

        };
    }
}
