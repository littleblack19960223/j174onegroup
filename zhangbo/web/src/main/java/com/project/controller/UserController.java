package com.project.controller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URLEncoder;

@Controller
public class UserController {

    @RequestMapping("test")
    @ResponseBody
    public String test() throws IOException {
        HttpClient httpClient= HttpClients.createDefault();
        HttpGet httpGet=new HttpGet("http://localhost:8081/service/test");
        HttpResponse httpResponse =httpClient.execute(httpGet);
        HttpEntity httpEntity =httpResponse.getEntity();
        String str=EntityUtils.toString(httpEntity,"utf-8");
        return str;
    }


    @RequestMapping("login")
    @ResponseBody
    public void login(HttpServletRequest request) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        String userName=request.getParameter("userName");
        String pwd=request.getParameter("pwd");
        // 参数
        StringBuffer params = new StringBuffer();
        params.append("userName="+userName + URLEncoder.encode("&", "utf-8"));
        params.append("&");
        params.append("pwd="+pwd);


        HttpPost httpPost = new HttpPost("http://localhost:8081/service/login" + "?" + params);

        // 设置ContentType(注:如果只是传普通参数的话,ContentType不一定非要用application/json)
        httpPost.setHeader("Content-Type", "charset=utf8");


        CloseableHttpResponse response = null;
        try {
            // 由客户端执行(发送)Post请求
            response = httpClient.execute(httpPost);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();

            System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                System.out.println("用户名和密码:" + EntityUtils.toString(responseEntity));
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
