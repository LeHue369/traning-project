package com.example.apiservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
//@Entity
@NoArgsConstructor
//@Table(name = "address")
public class Address {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

//	@Column
//	@NotNull
	private String street;
}
