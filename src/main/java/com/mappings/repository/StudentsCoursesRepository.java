package com.mappings.repository;

import com.mappings.entity.StudentsCourses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsCoursesRepository extends JpaRepository<StudentsCourses, Long> {
}