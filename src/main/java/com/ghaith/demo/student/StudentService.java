package com.ghaith.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findallstudent(){
        return List.of(
                new Student(
                        "ghaaaith",
                        "bouabda",
                        22,
                        LocalDate.now(),
                        "kalemni@gmail.com" )
        );
    }
}
