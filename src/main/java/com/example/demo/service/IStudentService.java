package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> queryAllStudents(Boolean isUseMybatis);
}
