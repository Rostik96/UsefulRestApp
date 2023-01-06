package com.rost.first.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rost.first.models.Person;

@Controller
@RequestMapping("/api")
public class FirstRestController {
    @ResponseBody
    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello world";
    }

    @ResponseBody
    @GetMapping("/new-person")
    public Person getNewPerson() {
        return new Person();
    }
}
