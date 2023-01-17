package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.dao.StudentDao;
import com.example.demo.dao.StudentMapper;
import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {
    private final StudentDao studentDao;
    private final StudentMapper studentMapper;

    public List<Student> queryAllStudents(Boolean isUseMybatis){
        if ( isUseMybatis ) {
            QueryWrapper<Student> query = new QueryWrapper<>();
            return studentMapper.selectList(query);
        } else {
            return studentDao.findAllStudents();
        }
    }
}
