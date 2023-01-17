package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "student")
public class Student {
    @TableId(value = "SNO")
    String sNo;
    @TableField(value = "SNAME")
    String sName;
    @TableField(value = "SSEX")
    String sSex;
}
