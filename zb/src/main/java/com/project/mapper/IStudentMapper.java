package com.project.mapper;

import com.project.entity.StudentEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IStudentMapper {
    /**
     * 查询所有学生
     * @return 学生集合
     */
    @Select("select * from t_student")
    @ResultMap("stuMap")
    List<StudentEntity> findAll();

    /**
     * 添加学生
     * @param stu 学生对象
     */
    @Insert("insert into t_student(f_name,f_phone)values(#{name},#{phone})")
    void add(StudentEntity stu);

    /**
     * 根据学生ID修改学生电话
     * @param id
     * @param newPhone
     */
    @Update("UPDATE t_student SET f_phone =#{param2} WHERE pk_id=#{param1}")
    void updatePhoneById(int id,String newPhone);

    /**
     * 根据学生ID删除学生
     * @param id
     */
    @Delete("delete from t_student where pk_id=#{id}")
    void delById(int id);
}
