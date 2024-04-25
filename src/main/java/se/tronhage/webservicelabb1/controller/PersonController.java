package se.tronhage.webservicelabb1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/rs/search/age/{age}")
    public ResponseEntity<?> searchByAge(@PathVariable int age) {
        List<Person> persons = personService.searchByAge(age);
        if (persons.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no results found for age: " + age);
        }
        return ResponseEntity.ok(persons);
    }

    @GetMapping("/rs/search/name/{name}")
    public ResponseEntity<?> searchByName(@PathVariable String name) {
        List<Person> persons = personService.searchByName(name);
        if (persons.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no results found for name: " + name);
        }
        return ResponseEntity.ok(persons);
    }

    @GetMapping("/rs/search/city/{city}")
    public ResponseEntity<?> searchByCity(@PathVariable String city) {
        List<Person> persons = personService.searchByCity(city);
        if (persons.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no results found for city: " + city);
        }
        return ResponseEntity.ok(persons);
    }

    @PutMapping("/rs/update/{id}")
    public ResponseEntity<?> updatePerson(@PathVariable Long id, @RequestBody Person updatedPerson) {
        personService.updatePerson(id, updatedPerson);
        return ResponseEntity.ok().build();
    }

}
