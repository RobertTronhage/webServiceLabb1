package se.tronhage.webservicelabb1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.tronhage.webservicelabb1.Entity.Person;
import se.tronhage.webservicelabb1.repo.PersonRepo;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepo personRepo;

    public List getAllPersons(){
        return personRepo.findAll();
    }

    public void createNewPerson(Person person){
        personRepo.save(person);
    }

    public List<Person> searchByAge(int age) {
        return personRepo.findByAge(age);
    }

    public List<Person> searchByName(String name) {
        return personRepo.findByNameContainingIgnoreCase(name);
    }

    public List<Person> searchByCity(String city) {
        return personRepo.findByCityContainingIgnoreCase(city);
    }

}
