package at.horn1347.springbootlab.service.impl;

import at.horn1347.springbootlab.model.User;
import at.horn1347.springbootlab.repository.UserRepository;
import at.horn1347.springbootlab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository repository;

    @Override
    public User save(User entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(User entity) {
        repository.delete(entity);
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public  List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<User> findUserByName(String name) {
        return Optional.ofNullable(repository.findByUserName(name).orElse(null));
    }
}
