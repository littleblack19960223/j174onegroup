package com.project.service.impl;

import com.project.entity.StudentEntity;
import com.project.mapper.IStudentMapper;
import com.project.service.IStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {

    @Resource
    IStudentMapper mapper;

    public List<StudentEntity> findAll() {
        return mapper.findAll();
    }

    public void add(StudentEntity stu) {
        mapper.add(stu);

    }

    public void updatePhoneById(int id, String newPhone) {
        mapper.updatePhoneById(id,newPhone);

    }

    public void delById(int id) {
        mapper.delById(id);

    }

    public static void main(String[] args) {

    }
}
