package com.zyz.service.impl;

import com.zyz.domain.User;
import com.zyz.service.UserService;

import java.util.Date;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/7 - 23:51
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class UserServiceimpl implements UserService {
    @Override
    public int register(User user) {
        user.setRole(1);
        user.setCreateTime(new Date());


        return 0;
    }
}
