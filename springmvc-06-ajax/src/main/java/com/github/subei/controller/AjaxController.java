package com.github.subei.controller;

import com.github.subei.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    @RequestMapping("k1")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name , HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>"+name);
        if ("subei".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> list = new ArrayList<User>();
        list.add(new User("哇哈哈1号",9,"男"));
        list.add(new User("哇哈哈2号",6,"男"));
        list.add(new User("哇哈哈3号",1,"男"));
        return list; // 由于@RestController注解，将list转成json格式返回
    }

    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg = "";
        //模拟数据库中存在数据
        if (name!=null){
            if ("subei".equals(name)){
                msg = "OK";
            }else {
                msg = "用户名输入错误";
            }
        }
        if (pwd!=null){
            if ("123456".equals(pwd)){
                msg = "OK";
            }else {
                msg = "密码输入有误";
            }
        }
        return msg; //由于@RestController注解，将msg转成json格式返回
    }
}
