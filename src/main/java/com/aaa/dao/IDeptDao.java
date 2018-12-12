package com.aaa.dao;

import com.aaa.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface IDeptDao {
    List<Map<String, Object>> listDept(Map<String,Object> query);

    List<Map<String, Object>> getDept(String deptno);

    void saveDept(Dept d);

    void delDept(String deptno);

    void addDept(Dept d);

    Integer countList(Map<String, Object> query);
}
