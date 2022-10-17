package com.example.servicecrud.controller;

import com.example.servicecrud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@RestController
public class StudentController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/template/students")
    public String getStudentList() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange("http://localhost:8080/api/students", HttpMethod.GET, entity, String.class).getBody();
    }

    @RequestMapping(value = "/template/students", method = RequestMethod.POST)
    public String createProducts(@RequestBody Student student) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Student> entity = new HttpEntity<Student>(student,headers);

        return restTemplate.exchange("http://localhost:8080/api/students", HttpMethod.POST, entity, String.class).getBody();
    }

    @RequestMapping(value = "/template/students/{id}", method = RequestMethod.DELETE)
    public String deleteProduct(@PathVariable("id") String id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Student> entity = new HttpEntity<Student>(headers);

        return restTemplate.exchange("http://localhost:8080/api/students/"+id, HttpMethod.DELETE, entity, String.class).getBody();
    }


    @RequestMapping(value = "/template/students", method = RequestMethod.PUT)
    public String updateProduct(@RequestBody Student student) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Student> entity = new HttpEntity<Student>(student,headers);

        return restTemplate.exchange("http://localhost:8080/api/students", HttpMethod.PUT, entity, String.class).getBody();
    }

}
