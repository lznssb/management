package com.example.lznssb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.lznssb.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    void updateTest();
}
