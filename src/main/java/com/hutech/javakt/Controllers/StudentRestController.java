package com.hutech.javakt.Controllers;

import com.hutech.javakt.Entities.Student;
import com.hutech.javakt.RequestEntities.StudentCreate;
import com.hutech.javakt.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentRestController {
    @Autowired
    private StudentServices studentServices;
    @GetMapping("")
    public List<Student> getAllStudents(){
        return studentServices.getAllStudent();
    }
    @PostMapping("")
    public Student createStudent(@RequestBody StudentCreate studentCreate){
        return studentServices.createStudent(studentCreate);
    }
}
