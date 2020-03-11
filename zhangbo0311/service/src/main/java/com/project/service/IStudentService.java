package com.project.service;

import com.project.entity.StudentEntity;

import java.util.List;


public interface IStudentService {
    void add(StudentEntity stu);
    List<StudentEntity> findAll();
}
