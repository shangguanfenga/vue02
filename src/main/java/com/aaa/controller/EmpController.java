package com.aaa.controller;

import com.aaa.entity.Emp;
import com.aaa.entity.ResultModel;
import com.aaa.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;


/**
 * @ClassName EmpController
 * @Description TODO
 * @Author LP
 * @Date 2018/12/8 13:39
 * @Version 1.0
 **/
@Controller
@RequestMapping("/emp")
public class EmpController extends BaseController{
    @Autowired
    private IEmpService empService;
    @RequestMapping("/jump")
    public String jump(){
        //return "listEmpPage";
        return "test";
    }
    @RequestMapping("/listEmp")
    @ResponseBody
    public Map<String,Object> listEmp(@RequestBody Map<String,Object> query){

        return empService.listEmp(query);
    }
    @ResponseBody
    @RequestMapping("/addEmp")
    public ResultModel addEmp(@RequestBody Emp emp){
        try{
            empService.addEmp(emp);
        }catch (Exception e){
            return returnError("添加失败");
        }
        return returnSuccess("添加成功");

    }
}
