package com.example.demo.repo;

import org.springframework.data.repository.ListCrudRepository;

import com.example.demo.model.Customer;

public interface CustomerRepository extends ListCrudRepository<Customer, String>{

}
