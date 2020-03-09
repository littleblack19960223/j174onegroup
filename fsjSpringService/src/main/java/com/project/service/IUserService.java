package com.project.service;

import com.project.bean.UserBean;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserService {
    public List<UserBean> findByName(String name);

    public void add(UserBean userBean);
}

