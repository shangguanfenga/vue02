package com.aaa.service;

import com.aaa.entity.Emp;

import java.util.Map;

public interface IEmpService {

    Map<String, Object> listEmp(Map<String, Object> query);

    void addEmp(Emp emp);
}
