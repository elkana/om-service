package com.example.demo.repo;

import org.springframework.data.repository.ListCrudRepository;

import com.example.demo.model.StructureCredit;

public interface StructureCreditRepository extends ListCrudRepository<StructureCredit, Integer>{

	StructureCredit findByCustId(String custId);

}
