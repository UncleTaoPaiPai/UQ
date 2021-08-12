package com.zyz.demoproject.service.impl;

import com.zyz.demoproject.domain.User;
import com.zyz.demoproject.mapper.UserMapper;
import com.zyz.demoproject.mapper.VideoMapper;
import com.zyz.demoproject.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/11 - 16:34
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
@Service
public class userServiceimpl implements userService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUser() {
        return userMapper.userList();
    }
}
