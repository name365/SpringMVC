package com.github.subei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//测试拦截器的控制器
@Controller
public class InterceptorController {
    @RequestMapping("/k1")
    @ResponseBody
    public String testFunction() {
        System.out.println("控制器中的方法执行了==》");
        return "hello";
    }
}
