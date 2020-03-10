package com.project.service;

import com.project.entity.StudentEntity;



public interface IStudentService {
    void add(StudentEntity stu);
    StudentEntity findById(int id);
}
