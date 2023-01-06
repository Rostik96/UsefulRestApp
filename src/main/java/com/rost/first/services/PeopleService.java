package com.rost.first.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rost.first.models.Person;
import com.rost.first.repositories.PeopleRepository;
import com.rost.first.util.PersonNotFoundException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
@Transactional(readOnly = true)
public class PeopleService {
    private final PeopleRepository peopleRepository;

    public List<Person> readAll() {
        return peopleRepository.findAll();
    }

    public Person findOne(int id) {
        return peopleRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException("Person with this ID wasn't found!"));
    }

    @Transactional
    public void save(Person person) {
        peopleRepository.save(person);
    }
}