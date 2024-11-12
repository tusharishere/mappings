package com.mappings.controller;

import com.mappings.service.StudentsCoursesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/studentsCourses")
public class StudentsCoursesController {

    private StudentsCoursesService studentsCoursesService;

    public StudentsCoursesController(StudentsCoursesService studentsCoursesService) {
        this.studentsCoursesService = studentsCoursesService;
    }
    @PostMapping
    public ResponseEntity<String> enrollStudentToCourse(@RequestParam Long studentId,
                                               @RequestParam Long courseId,
                                               @RequestParam String enrollmentDate){
        studentsCoursesService.enrollStudentToCourse(studentId, courseId, enrollmentDate);
        return ResponseEntity.ok("Student enrolled successfully!");
    }
}
