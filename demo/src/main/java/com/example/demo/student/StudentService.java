package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service //dependency injection
public class StudentService {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Özlem",
                        "ozlemkarabulut99@gmail.com",
                        LocalDate.of(1999, Month.FEBRUARY, 24),
                        21
                )
        );
    }
}
