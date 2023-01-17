package com.example.demo.dao;

import com.example.demo.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentDao {
    private final JdbcTemplate jdbcTemplate;

    public List<Student> findAllStudents() {
        return jdbcTemplate.query("select * from student", new BeanPropertyRowMapper<>(Student.class));
    }
}
