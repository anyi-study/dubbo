package com.codeJ.service.impl;

import com.codeJ.pojo.User;
import com.codeJ.service.UserService;
import org.apache.dubbo.config.annotation.Service; // 将这个类提供的方法（服务）对外发布。将访问的地址，ip，端口，路径注册到注册中心
//import org.springframework.stereotype.Service;  // 创建该类放入SpringIOC容器中，也就是bean定义

@Service(timeout = 3000,retries = 1,version = "1.0",weight = 200)
public class UserServiceImpl implements UserService {
    public String sayHello() {
        return "hello dubbo codeJ";
    }

    public User findUserById(Integer id) {
        System.out.println("v1.0");
        User user = new User(id, "codeJ", "123456");
        return user;
    }
}
