package com.zyz.domain;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/6 - 13:33
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class dept {

    private int deptno;
    private String dname;
    private String loc;

    @Override
    public String toString() {
        return "dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
