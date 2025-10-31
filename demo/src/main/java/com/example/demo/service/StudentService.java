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

    public Student getStudentByRno(int rno){
        int index = 0;
        boolean found = false;
        for(int i=0; i<students.size();i++){
            if(students.get(i).getRno() == rno){
                index = i;
                found = true;
                break;
            }
        }
        if(found){
           return students.get(index);
        }else{
            return new Student(0,"","","");
        }

    }

    public void createStudent(Student student){
        students.add(student);
    }

    public String updateStudent(Student student){
        int index = 0;
        boolean found = false;
        for(int i=0; i<students.size();i++){
            if(students.get(i).getRno()==student.getRno()){
                index = i;
                found = true;
                break;
            }
        }
        if(found){
            students.set(index, student);
            return "Update Successfully.";
        }else{
            return "No matching data found...";
        }
    }

    public String deleteStudent(int rno){
        int index = 0;
        boolean found = false;
        for(int i=0; i<students.size();i++){
            if(students.get(i).getRno()==rno){
                index = i;
                found = true;
                break;
            }
        }
        if(found){
            students.remove(index);
            return "Deleted Successfully.";
        }else{
            return "No matching data found...";
        }
    }

}
