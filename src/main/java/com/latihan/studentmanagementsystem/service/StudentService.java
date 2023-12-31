package com.latihan.studentmanagementsystem.service;

import com.latihan.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
