package com.example.lznssb.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lznssb.entity.User;
import com.example.lznssb.mapper.UserMapper;
import com.example.lznssb.service.UserService;
import com.example.lznssb.util.SaltUtil;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public void updateTest() {
        baseMapper.updateTest();
    }

    @Override
    public void register(User user) {
        SaltUtil.generate("123456");
    }
}
