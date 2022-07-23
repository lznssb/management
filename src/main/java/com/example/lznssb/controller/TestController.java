package com.example.lznssb.controller;

import com.example.lznssb.entity.User;
import com.example.lznssb.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// 测试
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    //注册
    @RequestMapping("/register")
    public String register(@RequestBody User user){
        try{
            userService.register(user);
            return "注册成功！！！！";
        }catch (Exception e) {
            e.printStackTrace();
            return "注册失败！！！！";
        }
    }


    //登出
    @RequestMapping("/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        System.out.println("登出成功  ========================");
        return "登出成功";
    }

    //登录
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
        //获取主题对象
        Subject subject = SecurityUtils.getSubject();
        try{
            subject.login(new UsernamePasswordToken(username,password));
            System.out.println("登录成功！！！");
            return "登录成功！！！";
        }catch (UnknownAccountException e) {
            e.printStackTrace();
            System.out.println("用户错误！！！");
        }catch (IncorrectCredentialsException e) {
            e.printStackTrace();
            System.out.println("密码错误！！！");
        }

        return "没有登录成功";
    }
}
