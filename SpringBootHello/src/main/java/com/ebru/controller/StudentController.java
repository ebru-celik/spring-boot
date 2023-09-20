package com.ebru.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController   // RESTful
public class StudentController {

    // http://localhost:8090
    // http://127.0.0.1:8090
    @GetMapping
   public  String  getHello() {
       return "Spring Boot Hello";
   }

}
