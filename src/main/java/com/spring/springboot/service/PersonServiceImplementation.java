package com.spring.springboot.service;

import com.spring.springboot.model.Person;
import com.spring.springboot.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImplementation implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImplementation(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPersons() {
        List<Person> allPerson;
        allPerson = personRepository.findAll();
        return allPerson;
    }
}
