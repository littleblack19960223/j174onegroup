package com.project.mapper;
import com.project.bean.UserBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface IUserMapper {
    @Select("select * from t_user3 where f_name=#{param}")
    @ResultMap("userMap")
    public List<UserBean> getUser(String name);

    @Insert("insert into t_user3(f_name,f_password,f_age) values(#{name},#{password},#{age})")
    public void add(UserBean userBean);
}
