package com.mappings.service;

import com.mappings.entity.Courses;
import com.mappings.repository.CoursesRepository;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {

    private CoursesRepository coursesRepository;

    public CoursesService(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    public Courses addCourses(Courses courses){
        Courses saved = coursesRepository.save(courses);
        return saved;
    }
}
