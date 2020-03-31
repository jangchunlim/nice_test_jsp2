package com.example.nice_test_jsp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping(value="/")
    public String hello(){
        return "index";
    }
//    payResult_utf.jsp
//    @RequestMapping(value="/payResult_utf")
//    public String payResult(){
//        return "payResult_utf";
//    }
//
//    @RequestMapping(value="/cancelRequest")
//    public String cancelRequest(){
//        return "cancelRequest";
//    }
//
//    @RequestMapping(value="/cancelResult")
//    public String cancelResult(){
//        return "cancelResult";
//    }

}

