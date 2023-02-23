package com.example.customerservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
//@Entity
@NoArgsConstructor
//@Table(name = "customer")
public class Customer {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

//	@Column
//	@NotNull
	private String name;
}
