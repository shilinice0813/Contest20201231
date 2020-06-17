package com.twschool.practice.web.dao.init;

import com.twschool.practice.web.dao.entity.UserInfo;
import com.twschool.practice.web.dao.impl.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Configuration
public class InitMockData {

    @Autowired
    UserDao userDao;

    @PostConstruct
    public void init() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId("1");
        userInfo.setScore(0L);
        userInfo.setUserName("syf");
        userDao.addUser(userInfo);

        UserInfo userInfo2 = new UserInfo();
        userInfo2.setId("2");
        userInfo2.setScore(0L);
        userInfo2.setUserName("syf2");
        userDao.addUser(userInfo2);
    }
}
