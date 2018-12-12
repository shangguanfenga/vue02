package com.aaa.service;

import com.aaa.entity.Dept;

import java.util.Map;

public interface IDeptService {

    Map<String, Object> listDept(Map<String, Object> query);

    Map<String, Object> getDept(String deptno);

    void saveDept(Dept d);

    void delDept(String deptno);

    void addDept(Dept d);
}
