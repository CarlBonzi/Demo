package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/query")
public class QueryController {
    @Autowired
    StudentServiceImpl studentService;

    @GetMapping("/getAllStudent/{isUseMybatis}")
    public @ResponseBody List<Student> queryForAllStudent(@PathVariable Boolean isUseMybatis) {
        return  studentService.queryAllStudents(isUseMybatis);
    }

}
