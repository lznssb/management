package com.example.lznssb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import sun.dc.pr.PRError;

@Data
@TableName("user")
public class User {

    @TableId(value = "ID" ,type = IdType.AUTO)
    private Integer id;

    @TableField(value = "JOB_NUMBER")
    private String jobNumber;

    @TableField(value = "DISPLAY_NAME")
    private String displayName;

    @TableField(value = "PASSWORD")
    private String password;
}
