package com.example.dockerDemo.controller;

import com.example.dockerDemo.model.Person;
import com.example.dockerDemo.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/persons")
    public List<Person> getAll(){
        return repository.findAll();
    }

    @PostMapping(path = "/persons")
    public Person savePerson(@RequestBody Person person){
        return repository.save(person);
    }
}
