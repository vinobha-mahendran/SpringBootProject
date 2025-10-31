package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/students/{rno}")
    public Student getStudentByRno(@PathVariable int rno){
        return studentService.getStudentByRno(rno);
    }

    @PostMapping("/students")
    public String createStudent(@RequestBody Student student) {

        studentService.createStudent(student);
        return "Student Created successfully";
    }
    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student) {
       return studentService.updateStudent(student);
    }

    @DeleteMapping("/students/{rno}")
    public String deleteStudent(@PathVariable int rno){
        return studentService.deleteStudent(rno);
    }
    
}
