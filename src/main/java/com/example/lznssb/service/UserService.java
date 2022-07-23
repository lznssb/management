package com.example.lznssb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.lznssb.entity.User;

public interface UserService extends IService<User> {

    void updateTest();

    void register(User user);
}
