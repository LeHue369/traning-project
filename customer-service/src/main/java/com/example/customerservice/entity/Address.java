package com.example.customerservice.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
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
