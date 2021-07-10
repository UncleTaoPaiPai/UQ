package com.zyz.pojo;

public class Student {

    private User user;
    private Integer stuid;
    private String stuname;
    private Integer stuage;

    public Student() {
        System.out.println("Student被创建");
    }

    public void stuinit(){
        System.out.println("STu初始化操作");
    }

    public User getUser() {
        return user;
    }

    public Student(User user, Integer stuid, String stuname, Integer stuage) {
        this.user = user;
        this.stuid = stuid;
        this.stuname = stuname;
        this.stuage = stuage;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "user=" + user +
                ", stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", stuage=" + stuage +
                '}';
    }
}
