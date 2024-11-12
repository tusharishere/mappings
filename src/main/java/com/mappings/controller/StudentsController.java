package com.mappings.controller;

import com.mappings.entity.Students;
import com.mappings.service.StudentsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentsController {

    private StudentsService studentsService;

    public StudentsController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @PostMapping
    public ResponseEntity<Students> createStudent(@RequestBody Students students){
        Students student = studentsService.createStudent(students);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

}
