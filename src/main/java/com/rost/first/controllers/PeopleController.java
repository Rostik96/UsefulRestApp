package com.rost.first.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rost.first.models.Person;
import com.rost.first.services.PeopleService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/people")
public class PeopleController {
    private final PeopleService peopleService;

    @GetMapping
    public List<Person> index() {
        return peopleService.readAll(); //Jackson под капотом конвертирует объекты в JSON.
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return peopleService.findOne(id);
    }
}
