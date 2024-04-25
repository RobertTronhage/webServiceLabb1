package se.tronhage.webservicelabb1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/rs/addperson")
    public ResponseEntity<Person> addNewPerson(@RequestBody Person person){
        personService.createNewPerson(person);
        return ResponseEntity.accepted().body(person);
    }

}
