package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/test")
    public String test() {
        return "Welcome to test Mapping";
    }

    @GetMapping("/world")
    public String world() {
        return "Welcome to world Mapping";
    }

    @GetMapping("/country")
    public  country() {
        return "Welcome to Indiagi Mapping";
    }
}
