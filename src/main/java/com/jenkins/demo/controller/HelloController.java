package com.jenkins.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HelloController {
    @RequestMapping(method= RequestMethod.GET)
    public String sayHello() {
        return "Hello from jenkins";
    }
}
