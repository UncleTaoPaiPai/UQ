package com.zyz.controller;

import com.zyz.domain.User;
import com.zyz.service.UserService;
import com.zyz.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/17 - 10:33
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
@RestController
@RequestMapping("api/v1//user")
public class UserController {

//    @PostMapping("login")
//    public JsonData login(String pwd, String username) {
//        System.out.println("username =" + username + "pwd =" + pwd);
//        return JsonData.buildSuccess("");
//    }
    @Autowired
    public UserService userService;

    @PostMapping("login")
    public JsonData login(User user) {
        System.out.println("user = "+user.toString() );
        String token = userService.login(user.getUsername(), user.getPwd());

        return token != null ? JsonData.buildSuccess(token):JsonData.buildError("密码错误");
    }

    @GetMapping("list_user")
    public JsonData listUser(){
        return JsonData.buildSuccess(userService.listUser());
    }

}
