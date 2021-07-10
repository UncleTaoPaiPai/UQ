package com.zyz.entity;

public class students {

    private Integer stuid;
    private String stuName;
    private String stuNo;
    private String stuPwd;

    public students() {
    }

    public students(Integer stuid, String stuName, String stuNo, String stuPwd) {
        this.stuid = stuid;
        this.stuName = stuName;
        this.stuNo = stuNo;
        this.stuPwd = stuPwd;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuPwd() {
        return stuPwd;
    }

    public void setStuPwd(String stuPwd) {
        this.stuPwd = stuPwd;
    }
}
