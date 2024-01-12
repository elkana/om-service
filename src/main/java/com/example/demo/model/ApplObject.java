package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ApplObject {
	@Id
	@GeneratedValue
	private Integer id;
	private String code;
	
	private String objCode;
}
