package com.zyz.mapper;

import com.zyz.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/17 - 0:51
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
@Repository
public class UserMapper {

    private static Map<String, User> userMap = new HashMap<>();

    static {
        userMap.put("tony",new User(1,"tony","123"));
        userMap.put("mike",new User(2,"mike","123"));
        userMap.put("amy",new User(3,"amy","123"));
    }

    public User login(String username, String pwd) {
        User user=userMap.get(username);
        if (username == null) {
            return null;
        }

        if (user.getPwd().equals(pwd)) {
            return user;
        }
       return null;
    }

    public List<User> listUser() {
        List<User> list = new ArrayList<>();
        list.addAll(userMap.values());
        return list;
    }
}
