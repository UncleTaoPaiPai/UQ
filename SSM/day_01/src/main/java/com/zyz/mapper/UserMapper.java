package com.zyz.mapper;

import com.zyz.domain.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/17 - 0:51
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class UserMapper {

    private static Map<Integer, User> userMap = new HashMap<>();

    static {
        userMap.put(1,new User(1,"tony","123"));
        userMap.put(2,new User(2,"mike","123"));
        userMap.put(3,new User(3,"amy","123"));

    }
}
