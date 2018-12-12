package com.aaa.service.impl;

import com.aaa.dao.IEmpDao;
import com.aaa.entity.Emp;
import com.aaa.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName EmpserviceImpl
 * @Description TODO
 * @Author LP
 * @Date 2018/12/8 13:41
 * @Version 1.0
 **/
@Service
public class EmpserviceImpl implements IEmpService {
    @Autowired
    private IEmpDao empDao;

    @Override
    public Map<String, Object> listEmp(Map<String, Object> query) {
        Map map=new HashMap<String,Object>();
        List<Map<String,Object>> list= empDao.listEmp(query);
        map.put("rowEmp",list);
        Integer count=empDao.countEmp();
        map.put("total",count);
        return map;
    }

    @Override
    public void addEmp(Emp emp) {
        empDao.addEmp(emp);
    }
}
