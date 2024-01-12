package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StructureCredit;
import com.example.demo.repo.CustomerRepository;
import com.example.demo.repo.StructureCreditRepository;

@Service
public class StructureCreditService {

	@Autowired StructureCreditRepository repoSC;
	@Autowired CustomerRepository repoCustomer;
	
	public List<StructureCredit> getAll() {	
		var list = repoSC.findAll();
		List<StructureCredit> newList = new ArrayList<>();
		for (var row : list) {
			var cust= repoCustomer.findById(row.getCustId()).get();
			row.setCustName(cust.getCustName());
			newList.add(row);
		}
		return newList;
	}

	public StructureCredit addStructureCredit(StructureCredit data) {		
		return repoSC.save(data);
	}

	public StructureCredit getByCustId(String custId) {
		var ret = repoSC.findByCustId(custId);
		
		// fill customer name
		var cust = repoCustomer.findById(custId).get();
		ret.setCustName(cust.getCustName());
		
		return ret;
	}

}
