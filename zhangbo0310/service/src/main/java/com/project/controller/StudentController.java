package com.project.controller;

import com.project.entity.StudentEntity;
import com.project.service.IStudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    IStudentService service;


    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    @ResponseBody
    public String studentAdd(@RequestBody StudentEntity stu){
          System.out.println(stu);
          service.add(stu);
          return "ok";
    }


    @RequestMapping("{id}/fiandById")
    public StudentEntity fiandById(@PathVariable("id")int id){
        return service.findById(id);
    }


}
