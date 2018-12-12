package com.aaa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName Emp
 * @Description TODO
 * @Author LP
 * @Date 2018/12/8 14:18
 * @Version 1.0
 **/
public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private String mgr;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hiredate;
    private String sal;
    private String comm;
    private Integer deptno;

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

    public String getMgr() {
        return mgr;
    }

    public void setMgr(String mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr='" + mgr + '\'' +
                ", hiredate=" + hiredate +
                ", sal='" + sal + '\'' +
                ", comm='" + comm + '\'' +
                ", deptno=" + deptno +
                '}';
    }
}
