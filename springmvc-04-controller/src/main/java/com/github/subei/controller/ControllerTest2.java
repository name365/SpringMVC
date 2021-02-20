package com.github.subei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//代表这个类会被spring接管
// 被这个注解的类，中的所有方法，如果返问值是string，并且有具体页面可以跳转，那么就会被视图解析器解析；
public class ControllerTest2 {
    // 映射访问路径
    @RequestMapping("/t2")
    public String index(Model model){
        // Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "ControllerTest2");
        // 返回视图位置
        return "test";
    }

    @RequestMapping("/t3")
    public String index2(Model model){
        // Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "test3");
        // 返回视图位置
        return "test";
    }
}
