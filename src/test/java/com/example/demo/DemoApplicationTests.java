package com.example.demo;

import com.example.demo.dao.StudentDao1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.example.demo")
public class DemoApplicationTests {

    @Autowired
    private StudentDao1 studentDao1;
    @Test
    public void getStudent(){
        System.out.println(studentDao1.selectById("001"));
    }

    @Test
   public void contextLoads() {
    }

}
