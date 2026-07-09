package com.gauravkulkarni.todoapplication.controller;

import com.gauravkulkarni.todoapplication.bean.HelloUserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class TestController {
    @RequestMapping(method= RequestMethod.GET,path="/hello_world")
    public String greetUser(){
        return "Hello User Welcome To The World Of JAVA + ANGULAR";
    }

    @RequestMapping(method=RequestMethod.GET,path="/")
    public String home(){
        return "TO DO APPLICATION";
    }

    @RequestMapping(method= RequestMethod.GET,path="/hello-world-bean")
    public HelloUserBean greetUserBean(){
        //throw new RuntimeException("Something went Wrong!");
        return new HelloUserBean("Hello User TO The World Of JAVA + ANGULAR",true);
    }

    @RequestMapping(method= RequestMethod.GET,path="/hello-world-path-variable/{name}")
    public HelloUserBean greetUserBeanPathVariable(@PathVariable String name){
        return new HelloUserBean("Hello " + name,true);
    }
}
