package com.example.crudstudent.controller;

import com.example.crudstudent.entity.Student;
import com.example.crudstudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentRestApi {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> students(){
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    Optional<Student> student(@PathVariable int id){
        return studentRepository.findById(id);
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
       return studentRepository.save(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id){
         studentRepository.deleteById(id);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

 }
