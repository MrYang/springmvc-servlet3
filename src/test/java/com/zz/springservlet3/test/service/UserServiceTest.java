package com.zz.springservlet3.test.service;


import com.zz.springservlet3.config.ServiceConfig;
import com.zz.springservlet3.entity.User;
import com.zz.springservlet3.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = ServiceConfig.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void test_find_all(){
        List<User> list = userService.findAll();

        Assert.assertNotNull(list.get(0));
    }

}
