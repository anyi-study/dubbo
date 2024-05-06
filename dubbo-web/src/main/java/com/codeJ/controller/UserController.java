package com.codeJ.controller;

import com.codeJ.pojo.User;
import com.codeJ.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
//    注入service
//    @Autowired
//    远程注入
    @Reference(mock = "force:return null")
    private UserService userService;
    @RequestMapping("/sayHello")
    public String sayHello(){
        return userService.sayHello();
    }
    @RequestMapping("/find")
    public User find(Integer id){
        return userService.findUserById(id);
    }
}
