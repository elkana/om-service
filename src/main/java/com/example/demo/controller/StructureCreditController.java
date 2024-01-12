package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StructureCredit;
import com.example.demo.service.StructureCreditService;

@RestController
@RequestMapping("/structure-credit")
public class StructureCreditController {
	
	@Autowired StructureCreditService serviceSC;
	
	@GetMapping("/list")
	public ResponseEntity<?> getAll() {
		var ret = serviceSC.getAll();
		return ResponseEntity.ok(ret);
	}
	
	@GetMapping("/getByCustId")
	public ResponseEntity<?> getByCustId(@RequestParam String custId) {
		var ret = serviceSC.getByCustId(custId);
		return ResponseEntity.ok(ret);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addStructureCredit(@RequestBody StructureCredit data) {
		var ret = serviceSC.addStructureCredit(data);
		return ResponseEntity.ok(ret);
	}
}
