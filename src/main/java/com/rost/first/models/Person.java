package com.rost.first.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
@Table(name = "person")
public class Person {
    public static final Person NULL_OBJECT = new Person(0, "John Doe", 0, "nobody@gmail.com");

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters inclusive")
    private String name;

    @Column(name = "age")
    @Min(value = 0, message = "Age should be greater or equals 0")
    private int age;

    @Column(name = "email")
    @Email
    @NotEmpty(message = "E-mail should not be empty")
    private String email;


    @Override
    public String toString() {
        return String.format("%s, %d; %s", name, age, email);
    }
}
