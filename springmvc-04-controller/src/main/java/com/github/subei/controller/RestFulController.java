package com.github.subei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {

    // 原来的：http://localhost:8080/springmvc_04/add?p1=1&p2=9
    // 现在的：http://localhost:8080/springmvc_04/add/45/66

    @RequestMapping("/add/{p1}/{p2}")
    public String index(@PathVariable int p1, @PathVariable String p2, Model model){

        String result = p1+p2;
        // Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "字符结果："+result);
        // 返回视图位置
        return "test";

    }

    @PostMapping("/add/{p}/{q}")
    public String index3(@PathVariable int p, @PathVariable int q, Model model){

        int result = p+q;
        // Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果1为："+result);
        // 返回视图位置
        return "test";

    }

    @PostMapping("/add/{p}/{q}")
    public String index4(@PathVariable int p, @PathVariable int q, Model model){

        int result = p+q;
        // Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果2为："+result);
        // 返回视图位置
        return "test";

    }


    // 映射访问路径,必须是GET求
    @RequestMapping(value = "/home",method = {RequestMethod.GET})
    public String index2(Model model){
        model.addAttribute("msg", "My warm home!");
        return "test";
    }
}
