package com.zyz.pojo;

import java.io.Serializable;

public class user implements Serializable {

    private Integer uid;
    private String name;
    private String password;

    public user() {
    }

    public user(Integer uid, String name, String password) {
        this.uid = uid;
        this.name = name;
        this.password = password;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
