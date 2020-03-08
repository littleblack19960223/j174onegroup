package com.project.service;

import com.project.entity.StudentEntity;

import java.util.List;

public interface IStudentService {

    public void addStudent(StudentEntity stu);

    public void delStudentById(int studentId);

    public void updateTelById(int studentId,String newTel);

    public List<StudentEntity> findAllStudentList();


}
