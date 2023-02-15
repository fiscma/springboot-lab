package at.horn1347.springbootlab.service;

import java.util.List;
import java.util.Optional;

public interface Service<T> {
     T save(T entity);

     void delete(T entity);

     Optional<T> findById(Long id);

    <T> List<T> findAll();

}
