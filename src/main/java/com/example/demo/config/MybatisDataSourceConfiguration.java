package com.example.demo.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MybatisDataSourceConfiguration {
    @Bean
    DataSource druidDataSource() {
        return DruidDataSourceBuilder.create().build();
    }
}
