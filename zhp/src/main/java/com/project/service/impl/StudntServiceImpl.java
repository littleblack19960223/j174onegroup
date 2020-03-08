package com.project.service.impl;

import com.project.entity.StudentEntity;
import com.project.mapper.IStudnetMapper;
import com.project.service.IStudentService;

import javax.annotation.Resource;
import java.util.List;

public class StudntServiceImpl implements IStudentService {
    @Resource
    private IStudnetMapper studentMapper;


    public void add(StudentEntity studentEntity) {
        studentMapper.add(studentEntity);
    }

    public List<StudentEntity> findAll() {
        return studentMapper.findAll();
    }

    public void del(int id) {
        studentMapper.del(id);
    }

    public void update(int id, String phone) {
        studentMapper.update(id,phone);
    }
}
