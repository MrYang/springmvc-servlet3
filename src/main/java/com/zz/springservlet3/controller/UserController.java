package com.zz.springservlet3.controller;

import com.zz.springservlet3.entity.User;
import com.zz.springservlet3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping
    public List<User> index() {
        return userService.findAll();
    }
}
