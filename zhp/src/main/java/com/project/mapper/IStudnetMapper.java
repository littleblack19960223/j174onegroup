package com.project.mapper;

import com.project.entity.StudentEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IStudnetMapper {
    @Insert("insert into t_student(f_name,f_phone) values(#{name},#{phone})")
    public void add(StudentEntity studentBean);

    @Select("select * from t_student")
    @ResultMap("studentMap")
    public List<StudentEntity> findAll();

    @Delete("delete from t_student where pk_id=#{id}")
    public void del(int id);

    @Update("update t_student set f_phone=#{param2} where pk_id = #{param1}")
    public void update(int id, String phone);
}
