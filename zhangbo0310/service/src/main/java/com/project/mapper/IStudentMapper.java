package com.project.mapper;

import com.project.entity.StudentEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IStudentMapper {
    @Insert("insert into t_student(f_name,f_phone)values(#{name},#{phone})")
    void add(StudentEntity stu);
    @Select("select * from t_student where pk_id=#{id}")
    @ResultMap("stuMap")
    StudentEntity findById(int id);

}
