package com.project.service;

import com.project.entity.StudentEntity;

import java.util.List;

public interface IStudentService {
    /**
     * 查询所有学生
     * @return 学生集合
     */
    List<StudentEntity> findAll();

    /**
     * 添加学生
     * @param stu 学生对象
     */
    void add(StudentEntity stu);

    /**
     * 根据学生ID修改学生电话
     * @param id
     * @param newPhone
     */
    void updatePhoneById(int id,String newPhone);

    /**
     * 根据学生ID删除学生
     * @param id
     */
    void delById(int id);
}
