package com.project.service;

import com.project.bean.StudentBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IStudentService {

    public void add(StudentBean studentBean);


    public List<StudentBean> findAll();


    public void del(int id);

    public void update(int id, String name, String phone);
}
