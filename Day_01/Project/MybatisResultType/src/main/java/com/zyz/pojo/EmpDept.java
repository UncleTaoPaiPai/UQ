package com.zyz.pojo;

import java.util.Date;

public class EmpDept {

    @Override
    public String toString() {
        return "EmpDept{" +
                "dept=" + dept +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                ", empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                '}';
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
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

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getMgr() {
        return mgr;
    }

    public void setMgr(Double mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    private Dept dept;

    public EmpDept(Dept dept, String dname, String loc, Integer empno, String ename, String job, Double mgr, Date hiredate, Double sal, Double comm) {
        this.dept = dept;
        this.dname = dname;
        this.loc = loc;
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
    }
//    private Integer deptno;

    private String dname;

    private String loc;

    private Integer empno;

    private String ename;

    private String job;

    private Double mgr;

    private Date hiredate;

    private Double sal;

    private Double comm;

    public EmpDept() {
    }


}
