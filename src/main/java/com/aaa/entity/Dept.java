package com.aaa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName Dept
 * @Description TODO
 * @Author LP
 * @Date 2018/12/7 14:17
 * @Version 1.0
 **/
public class Dept {
    private Integer deptno;
    private String dname;
    private String loc;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    private String imageUrls;

    public String getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                ", createtime=" + createtime +
                ", imageUrls='" + imageUrls + '\'' +
                '}';
    }
}
