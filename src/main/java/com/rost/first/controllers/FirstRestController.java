package com.rost.first.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "df")
@RequestMapping("/api")
public class FirstRestController {
    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello world";
    }
}
