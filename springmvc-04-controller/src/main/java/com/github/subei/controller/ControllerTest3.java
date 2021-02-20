package com.github.subei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/s1")
public class ControllerTest3 {

    @RequestMapping("/y1")
    public String test(Model model){
        model.addAttribute("msg","s1/y1");
        return "test";
    }
}


