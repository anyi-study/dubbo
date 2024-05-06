package com.codeJ.service.impl;

import com.codeJ.pojo.User;
import com.codeJ.service.UserService;
import org.apache.dubbo.config.annotation.Service;
//import org.springframework.stereotype.Service;  // 创建该类放入SpringIOC容器中，也就是bean定义

@Service(timeout = 3000,retries = 1,version = "2.0")
public class UserServiceImpl2 implements UserService {
    public String sayHello() {
        return "hello dubbo codeJ";
    }

    public User findUserById(Integer id) {
        System.out.println("v2.0");
        User user = new User(id, "codeJ", "123456");
        return user;
    }
}
