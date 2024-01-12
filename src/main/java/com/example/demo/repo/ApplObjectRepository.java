package com.example.demo.repo;

import org.springframework.data.repository.ListCrudRepository;

import com.example.demo.model.ApplObject;

public interface ApplObjectRepository extends ListCrudRepository<ApplObject, Integer>{

}
