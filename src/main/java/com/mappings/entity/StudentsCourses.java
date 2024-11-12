package com.mappings.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "students_courses")
public class StudentsCourses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "students_id")
    private Students students;

    @ManyToOne
    @JoinColumn(name = "courses_id")
    private Courses courses;

    @Column(name = "enrollment_date", nullable = false)
    private String enrollmentDate;

}