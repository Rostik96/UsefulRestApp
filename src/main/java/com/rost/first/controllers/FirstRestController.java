package com.rost.first.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rost.first.models.Person;

@RestController
@RequestMapping("/api")
public class FirstRestController {
    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello world";
    }
}
