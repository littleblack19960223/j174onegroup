package com.project.service.impl;

import com.project.bean.UserBean;
import com.project.mapper.IUserMapper;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserMapper mapper;

    public List<UserBean> findByName(String name) {
        return mapper.getUser(name);
    }

    public void add(UserBean userBean){
        mapper.add(userBean);
    }
}
