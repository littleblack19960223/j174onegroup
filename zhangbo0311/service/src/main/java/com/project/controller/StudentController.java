package com.project.controller;

import com.project.entity.StudentEntity;
import com.project.service.IStudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudentController {

    @Resource
    IStudentService service;


    @RequestMapping("addStudent")
    public String studentAdd(StudentEntity stu){
          System.out.println(stu);
          service.add(stu);
          return "ok";
    }


    @RequestMapping("fiandAll")
    public List<StudentEntity> fiandAll(){
        return service.findAll();
    }


}
