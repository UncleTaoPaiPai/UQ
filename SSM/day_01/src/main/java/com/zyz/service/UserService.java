package com.zyz.service;

import com.zyz.domain.User;

import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/17 - 10:26
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public interface UserService {

    String login(String username, String pwd);

    List<User> listUser();
}
