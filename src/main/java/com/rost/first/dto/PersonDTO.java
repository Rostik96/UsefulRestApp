package com.rost.first.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDTO {
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters inclusive")
    private String name;

    @Min(value = 0, message = "Age should be greater or equals 0")
    private int age;

    @Email
    @NotEmpty(message = "E-mail should not be empty")
    private String email;
}
