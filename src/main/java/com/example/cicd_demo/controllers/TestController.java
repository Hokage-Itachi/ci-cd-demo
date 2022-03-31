package com.example.cicd_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello world ver 2";
    }

    @GetMapping("/test")
    public String test() {
        return "Test";
    }
}
