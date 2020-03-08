package com.project.service;

import com.project.entity.StudentEntity;

import java.util.List;

public interface IStudentService {

    public void add(StudentEntity studentEntity);


    public List<StudentEntity> findAll();


    public void del(int id);

    public void update(int id, String phone);
}
