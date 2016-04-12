package com.zz.springservlet3.controller;

import com.zz.springservlet3.entity.User;
import com.zz.springservlet3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping
    @ResponseBody
    public List<User> index() {
        return userService.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getOne(@PathVariable("id")Long id){
        return userService.getOne(id);
    }
}
