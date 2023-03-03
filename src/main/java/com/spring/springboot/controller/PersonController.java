package com.spring.springboot.controller;

import com.spring.springboot.model.Person;
import com.spring.springboot.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")

public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/getAll")

    public List<Person> getAllPerson(){
        return personService.getAllPersons();
    }
}
