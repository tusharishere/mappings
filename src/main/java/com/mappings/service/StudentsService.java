package com.mappings.service;

import com.mappings.entity.Students;
import com.mappings.repository.StudentsRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {

    private StudentsRepository studentsRepository;

    public StudentsService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public Students createStudent(Students students) {
        Students savedStu = studentsRepository.save(students);
        return savedStu;
    }
}
