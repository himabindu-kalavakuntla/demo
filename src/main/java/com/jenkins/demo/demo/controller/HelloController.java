package com.jenkins.demo.demo.controller;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("customers")
@RestController
public class HelloController {


    @RequestMapping(method=RequestMethod.GET)
    public String sayHello() {
        return "Hello";
    }
    
}