package se.tronhage.webservicelabb1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.tronhage.webservicelabb1.Entity.Person;
import se.tronhage.webservicelabb1.service.PersonService;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/rs/getall")
    public List getAllPersons(){
        return personService.getAllPersons();
    }

}
