package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import com.example.demo.common.JsonDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@Entity
public class StructureCredit {
	@Id
	@GeneratedValue
	private Integer id;
	private String code;
	private String applCode;
//	private String custName;
	private BigDecimal principal;
	
	@JsonSerialize(using = JsonDateTimeSerializer.class)
	private Date createdDate;
	
	private String custId;
	@Transient
	private String custName;
//	private Customer customer;
}
