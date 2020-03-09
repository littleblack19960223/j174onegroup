package com.project.controller;

import com.project.bean.UserBean;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private IUserService service;

    @RequestMapping("find/{name}")
    @ResponseBody
    public List<UserBean> findUserByName(@PathVariable("name") String name){
        return service.findByName(name);
    }

    @RequestMapping("add")
    public void addUser(@RequestBody UserBean userBean, BindingResult result, HttpServletResponse response) throws IOException {
        if (result.hasErrors()) {//判断验证是否有错误信息
            //错误信息字符串
            String str = "";
            //遍历验证错误的集合，并且拼接错误信息
            for (FieldError fieldError : result.getFieldErrors()) {
                str += fieldError.getDefaultMessage() + "<br>";
            }
            //把错误信息字符串响应给浏览器
            response.getWriter().print(str);
            //跳出方法
            return;
        }
        service.add(userBean);
        //成功则响应字符串ok
        response.getWriter().print("ok");
    }
}
