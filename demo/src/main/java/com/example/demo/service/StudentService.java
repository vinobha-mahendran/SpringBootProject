package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentService {

    List<Student> students= new ArrayList<>
        (Arrays.asList(
            new Student(1,"Vinobha","Female","Java"),
            new Student(2,"Ajith","Male","SpringBoot")
        )
        );

    public List<Student> getAllStudent(){
        return students;
    }

}
