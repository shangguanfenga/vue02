package com.aaa.service.impl;

import com.aaa.dao.IDeptDao;
import com.aaa.entity.Dept;
import com.aaa.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName DeptServiceImpl
 * @Description TODO
 * @Author LP
 * @Date 2018/12/7 13:45
 * @Version 1.0
 **/
@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired
    private IDeptDao deptDao;
    @Override
    public Map<String, Object> listDept(Map<String, Object> query) {
        Map<String,Object> map =new HashMap<String,Object>();
        List<Map<String, Object>> list = deptDao.listDept(query);
        Integer count=deptDao.countList(query);
        map.put("totalList",count);
        map.put("rowList",list);
        return map;
    }

    @Override
    public Map<String, Object> getDept(String deptno) {
       List<Map<String, Object>>  list=deptDao.getDept(deptno);
       if(list.size()>0){
           return  list.get(0);
       }
        return null;
    }

    @Override
    public void saveDept(Dept d) {
        deptDao.saveDept(d);
    }

    @Override
    public void delDept(String deptno) {
        deptDao.delDept(deptno);
    }

    @Override
    public void addDept(Dept d) {
        deptDao.addDept(d);
    }
}
