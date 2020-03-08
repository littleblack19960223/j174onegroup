package com.project.mapper;

import com.project.entity.StudentEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IStudentMapper {

    @Insert("insert into t_student(f_name,f_tel) values(#{name},#{tel})")
    public void addStudent(StudentEntity stu);

    @Delete("delete from t_student where pk_id=#{id}")
    public void delStudentById(int studentId);

    @Update("update  t_student set f_tel =#{newtel} where pk_id=#{id}")
    public void updateTelById(@Param("id") int studentId,@Param("newtel") String newTel);

    @Select("select * from t_student")
    @ResultMap("stuRM")
    public List<StudentEntity> findAllStudentList();

}
