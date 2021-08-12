package com.zyz.demoproject.mapper;

import com.zyz.demoproject.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/11 - 16:30
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@Repository
public class UserMapper {

    private static Map<Integer, User> userMap =new HashMap<>();

    static {
        userMap.put(1,new User(1,"Jack","123"));
        userMap.put(2,new User(2,"Mike","123"));
        userMap.put(3,new User(3,"Tony","123"));
        userMap.put(4,new User(4,"Lucy","123"));
        userMap.put(5,new User(5,"Lily","123"));
    }

    public List<User> userList() {
        List<User> userList = new ArrayList<>();
        userList.addAll(userMap.values());
        return userList;
    }









}
