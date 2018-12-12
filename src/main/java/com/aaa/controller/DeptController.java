package com.aaa.controller;

import com.aaa.entity.Dept;
import com.aaa.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @ClassName DeptController
 * @Description TODO
 * @Author LP
 * @Date 2018/12/7 13:40
 * @Version 1.0
 **/
@RequestMapping("/dept")
@Controller
public class DeptController extends BaseController{
    @Autowired
    private IDeptService deptService;
    @Value("D:/load")
    private String filePath;

    @RequestMapping("/jump")
    public String jump(){
        return "listDepartment";
    }
    @RequestMapping("listDept")
    @ResponseBody
    public Map<String,Object> listDept(@RequestBody Map<String,Object> query){
        return deptService.listDept(query);
    }
    @RequestMapping("getDept")
    @ResponseBody
    public Map<String,Object> getDept(String deptno){
        return deptService.getDept(deptno);
    }
    @RequestMapping("saveDept")
    @ResponseBody
    public void saveDept(@RequestBody Dept d){

        deptService.saveDept(d);
    }
    @RequestMapping("addDept")
    @ResponseBody
    public void addDept(@RequestBody Dept d){
        System.out.println(d);
        deptService.addDept(d);
    }
    @RequestMapping("delDept")
    @ResponseBody
    public void delDept(String  deptno){
        deptService.delDept(deptno);
    }
    @RequestMapping("/upload")
    @ResponseBody
    public Map  upload(@RequestParam MultipartFile file) {
        return upload(file,filePath);
    }

}
