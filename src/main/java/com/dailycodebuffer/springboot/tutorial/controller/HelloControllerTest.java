package com.dailycodebuffer.springboot.tutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Component // we adding this class to spring container , when ever we need this class spring container will bring it .
//@Controller //means this is controller ( inside it we have @component) )
//@RestController //because we creating rest API so we need to use @RestController instead of @Controller
//also it tells us that will return @responseBody .
public class HelloControllerTest {

    @Value("${welcome.message}")
    private String welcomeMessage;

    //    @RequestMapping(value = "/" , method = RequestMethod.GET) // @RequestMapping - mapping request to this particular method and pass value /
    @GetMapping("/") //instead of using @RequestMapping with adding the parameters , it's very simple.
    public String helloWorld() {
        return welcomeMessage;
    }

}


