package at.horn1347.springbootlab.service;

import at.horn1347.springbootlab.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService extends Service<User>{
    Optional<User> findUserByName(String name);
}
