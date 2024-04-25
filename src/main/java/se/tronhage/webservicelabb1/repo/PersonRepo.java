package se.tronhage.webservicelabb1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.tronhage.webservicelabb1.Entity.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepo extends JpaRepository <Person,Integer> {

    
    List<Person> findByAge(int age);

    List<Person> findByNameContainingIgnoreCase(String name);

    List<Person> findByCityContainingIgnoreCase(String city);

    Optional<Person> findById(Long id);

    void deleteById(Long id);
}
