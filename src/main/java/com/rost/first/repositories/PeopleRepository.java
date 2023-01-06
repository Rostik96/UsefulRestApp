package com.rost.first.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rost.first.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
