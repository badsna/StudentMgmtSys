package com.example.studentmgmtsys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @GetMapping("/hi")
    public List<String> hi(){
        return List.of("hi","world");
    }
}
