package com.zyz.entity;

public class teacher {

    private Integer tid;
    private String tName;
    private String userName;
    private String pwd;

    public teacher() {
    }

    public teacher(Integer tid, String tName, String userName, String pwd) {
        this.tid = tid;
        this.tName = tName;
        this.userName = userName;
        this.pwd = pwd;
    }

    public Integer gettid() {
        return tid;
    }

    public void settId(Integer tid) {
        this.tid = tid;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "tid=" + tid +
                ", tName='" + tName + '\'' +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
