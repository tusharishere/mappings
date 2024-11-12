package com.mappings.service;

import com.mappings.entity.Courses;
import com.mappings.entity.Students;
import com.mappings.entity.StudentsCourses;
import com.mappings.repository.CoursesRepository;
import com.mappings.repository.StudentsCoursesRepository;
import com.mappings.repository.StudentsRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentsCoursesService {

    private StudentsRepository studentsRepository;
    private CoursesRepository coursesRepository;
    private StudentsCoursesRepository studentsCoursesRepository;

    public StudentsCoursesService(StudentsRepository studentsRepository, CoursesRepository coursesRepository, StudentsCoursesRepository studentsCoursesRepository) {
        this.studentsRepository = studentsRepository;
        this.coursesRepository = coursesRepository;
        this.studentsCoursesRepository = studentsCoursesRepository;
    }


    public String enrollStudentToCourse(Long studentId, Long courseId, String enrollmentDate) {
        Students students = studentsRepository.findById(studentId).get();
        Courses courses = coursesRepository.findById(courseId).get();
        StudentsCourses studentsCourses = new StudentsCourses();
        studentsCourses.setStudents(students);
        studentsCourses.setCourses(courses);
        studentsCourses.setEnrollmentDate(enrollmentDate);
        studentsCoursesRepository.save(studentsCourses);
        return "enrolled successfully";
    }
}
