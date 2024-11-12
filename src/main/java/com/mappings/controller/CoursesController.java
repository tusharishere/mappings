package com.mappings.controller;

import com.mappings.entity.Courses;
import com.mappings.service.CoursesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/courses")
public class CoursesController {

    private CoursesService coursesService;

    public CoursesController(CoursesService coursesService) {
        this.coursesService = coursesService;
    }

    @PostMapping
    public ResponseEntity<Courses> addCourses(@RequestBody Courses courses){
        Courses saved = coursesService.addCourses(courses);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}
