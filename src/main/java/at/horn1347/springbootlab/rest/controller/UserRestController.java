package at.horn1347.springbootlab.rest.controller;

import at.horn1347.springbootlab.model.User;
import at.horn1347.springbootlab.repository.UserRepository;
import org.springframework.http.ResponseEntity;

public interface UserRestController extends RestController<User> {

    ResponseEntity<User> save(String name);

    ResponseEntity<User> findByName(String name);
}
