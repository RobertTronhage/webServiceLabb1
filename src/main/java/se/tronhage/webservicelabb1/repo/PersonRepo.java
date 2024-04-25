package se.tronhage.webservicelabb1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.tronhage.webservicelabb1.Entity.Person;

@Repository
public interface PersonRepo extends JpaRepository <Person,Integer> {

}
