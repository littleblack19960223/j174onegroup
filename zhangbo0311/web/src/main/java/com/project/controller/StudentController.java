package com.project.controller;

import com.project.entity.StudentEntity;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RestController
public class StudentController {

    @RequestMapping("addStudent")
    public String studentAdd(@RequestBody StudentEntity stu) throws IOException {
        //1、创建httpclient
        HttpClient httpClient = HttpClients.createDefault();
        //创建post请求
        HttpPost post = new HttpPost("http://localhost:8081/service/addStudent");

        //post放入参数
        List<BasicNameValuePair> listParm = new ArrayList<>();
        listParm.add(new BasicNameValuePair("name", stu.getName()));
        listParm.add(new BasicNameValuePair("phone", stu.getPhone()));

        post.setEntity(new UrlEncodedFormEntity(listParm, "utf-8"));

        HttpResponse httpResponse=  httpClient.execute(post);
        HttpEntity entity=httpResponse.getEntity();
        String result=EntityUtils.toString(entity,"utf-8");

         return result;
    }


    @RequestMapping("fiandAll")
    public String fiandAll() throws IOException {
        HttpClient httpClient= HttpClients.createDefault();
        //创建get对象
        HttpGet get = new HttpGet("http://localhost:8081/service/fiandAll");
        get.setHeader("Content-Type", "application/json;charset=utf8");
        HttpResponse httpResponse= httpClient.execute(get);
        //获取返回的实体
        HttpEntity httpEntity= httpResponse.getEntity();
        //获取实体对象中的字符，也就是后端返回的json
        String json=EntityUtils.toString(httpEntity,"utf-8");
        return json;
    }

}
