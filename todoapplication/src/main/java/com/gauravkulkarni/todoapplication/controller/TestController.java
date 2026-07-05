package com.gauravkulkarni.todoapplication.controller;

import com.gauravkulkarni.todoapplication.bean.HelloUserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(method= RequestMethod.GET,path="/hello_world")
    public String greetUser(){
        return "Hello User";
    }

    @RequestMapping(method=RequestMethod.GET,path="/")
    public String home(){
        return "TO DO APPLICATION";
    }

    @RequestMapping(method= RequestMethod.GET,path="/hello-world-bean")
    public HelloUserBean greetUserBean(){
        return new HelloUserBean("Hello User",true);
    }
}
