package com.codegym.demo.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Repository<T>{
    List<T> getAll();
    void save(T t);
}
