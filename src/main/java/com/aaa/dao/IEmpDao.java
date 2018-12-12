package com.aaa.dao;

import com.aaa.entity.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface IEmpDao {
    List<Map<String, Object>> listEmp(Map<String, Object> query);

    Integer countEmp();

    void addEmp(Emp emp);
}
