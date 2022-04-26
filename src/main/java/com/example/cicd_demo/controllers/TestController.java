package com.example.cicd_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String helloWorld() {
        return "Test sonarqube 2";
    }

    @GetMapping("/test")
    public String test() {
        return "Test dev 12";
    }

    @GetMapping("/annv")
    public String annv() {
        return "Test annv merge 2";
    }
}
