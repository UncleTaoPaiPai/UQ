package com.zyz.factory;

import com.zyz.pojo.User;

public class UsersFactory {

//    public User getInstance(){
//        return new User(123,"刘德华",30,"男");
//    }

    public static User getInstance(){
        return new User(123,"刘德华",30,"男");
    }

    public User getInstance(User user){
        return user;
    }
}
