package com.zyz.service.impl;

import com.zyz.domain.User;
import com.zyz.mapper.UserMapper;
import com.zyz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/17 - 10:27
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@Service
@Component
public class UserServiceimpl implements UserService {

    private static Map<String, User> sessionMap = new HashMap<>();

    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(String username, String pwd) {

        User user = userMapper.login(username,pwd);
        if (user==null) {
            return null;
        }else {
            String token = UUID.randomUUID().toString();
            System.out.println(token);
            sessionMap.put(token,user);
            return token;
        }
    }

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }
}
