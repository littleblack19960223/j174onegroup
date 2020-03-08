package com.project.service.impl;

import com.project.entity.StudentEntity;
import com.project.mapper.IStudentMapper;
import com.project.service.IStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional  //支持事务管理
public class StudentServiceImpl implements IStudentService {

    @Resource
    private IStudentMapper mapper;

    public void addStudent(StudentEntity stu) {
        mapper.addStudent(stu);
    }

    public void delStudentById(int studentId) {
        mapper.delStudentById(studentId);
    }

    public void updateTelById(int studentId, String newTel) {
        mapper.updateTelById(studentId,newTel);
    }

    public List<StudentEntity> findAllStudentList() {
        return mapper.findAllStudentList();
    }

}
