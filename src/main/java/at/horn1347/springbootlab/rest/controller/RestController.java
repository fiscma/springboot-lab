package at.horn1347.springbootlab.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RestController<T> {
    ResponseEntity<T> save(T entity);

    void delete(T entity);

    ResponseEntity<List<T>> findAll();

}
