package com.ebru.controller;

import com.ebru.exception.ResourceNotFoundException;
import com.ebru.model.Student;
import com.ebru.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


// http://localhost:8090/api/v1
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;

   /*
    getAllStudent
    getOneStudent
    createStudent
    deleteOneStudent
    updateOneStudent
     */

    // GET - SELECT ALL
    // http://localhost:8090/api/v1/student
    @GetMapping("/student")
    public List<Student> getAllStudent (){
        return studentService.getAllStudent();
    }

    // GET - SELECT WHERE
    // http://localhost:8090/api/v1/student/1
    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getOneStudent (@PathVariable (value = "id") Long id) throws ResourceNotFoundException {
        return studentService.getOneStudent(id);
    }


    // POST - INSERT
    // http://localhost:8090/api/v1/student
    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }


    // DELETE - DELETE
    // http://localhost:8090/api/v1/student/1
    @DeleteMapping("/student/{id}")
    public Map<String, Boolean> deleteOneStudent (@PathVariable (value = "id") Long id) throws ResourceNotFoundException {
        return  studentService.deleteOneStudent(id);
    }


    // PUT - UPDATE
    // http://localhost:8090/api/v1/student/1
    @PutMapping("/student/{id}")
    public ResponseEntity<Student> updateOneStudent (
            @PathVariable (value = "id") Long id,
            @RequestBody Student student) throws ResourceNotFoundException {

        /* // for the method updateOneStudent(Student student)
        student.setId(id);
        return studentService.updateOneStudent(student);
     */
        return studentService.updateOneStudent2(id, student);
    }





}
