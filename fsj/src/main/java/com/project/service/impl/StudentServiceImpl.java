package com.project.service.impl;

import com.project.bean.StudentBean;
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
    private IStudentMapper studentMapper;

    public void add(StudentBean studentBean) {
        studentMapper.add(studentBean);
    }

    public List<StudentBean> findAll() {
        return studentMapper.findAll();
    }

    public void del(int id) {
        studentMapper.del(id);
    }

    public void update(int id, String name, String phone) {
        studentMapper.update(id,name,phone);
    }
}
