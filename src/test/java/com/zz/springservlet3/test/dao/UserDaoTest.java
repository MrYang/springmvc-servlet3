package com.zz.springservlet3.test.dao;

import com.zz.springservlet3.config.PersistenceConfig;
import com.zz.springservlet3.dao.UserDao;
import com.zz.springservlet3.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = PersistenceConfig.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test_user_get(){
        User user = userDao.getOne(1L);
        Assert.assertNotNull(user);
    }

    @Test
    public void insert_user(){
        User user = new User();
        user.setId(1L);
        user.setUsername("yxb");
        user.setCreateDate(new Date());
        user.setUpdateDate(new Date());
        userDao.save(user);

        Assert.assertNotNull(user.getId());
    }
}
