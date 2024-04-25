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

    public void createNewPerson(){

    }

}
