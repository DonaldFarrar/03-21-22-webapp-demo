package com.revature.webappdcfdemo032122.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from spring boot";
    };
    @GetMapping("/rambling")
    public String ramble(){
        return "Yada yada yada blah blah";
    };
}
