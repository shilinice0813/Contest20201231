package com.twschool.practice.web.dao.impl;

import com.twschool.practice.web.dao.entity.UserInfo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDao {

    private List<UserInfo> users = Collections.synchronizedList(new ArrayList<>());

    public UserInfo addUser(UserInfo userInfo) {
        users.add(userInfo);
        return userInfo;
    }

    public boolean deleteUser(String id) {
        return users.stream().anyMatch((item) -> item.getId().equals(id));
    }

    public UserInfo queryUser(String id) {
        List<UserInfo> collect = users.stream().filter((item) -> item.getId().equals(id)).collect(Collectors.toList());
        return collect.get(0);
    }
}
