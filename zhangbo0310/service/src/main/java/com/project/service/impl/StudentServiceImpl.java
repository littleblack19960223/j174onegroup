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
    private IStudentMapper mapper;


    public void add(StudentEntity stu) {
        mapper.add(stu);

    }

    public StudentEntity findById(int id) {
        return mapper.findById(id);
    }


}
