package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("HDH");
        person.setAge(25);
        person.setAddress("경기");
        person.setJob("대학생");
        return person;
    }
}