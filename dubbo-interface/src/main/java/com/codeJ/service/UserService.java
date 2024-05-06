package com.codeJ.service;

import com.codeJ.pojo.User;

public interface UserService {
    String sayHello();
    User findUserById(Integer id);
}
