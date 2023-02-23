package com.example.apiservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
//@Entity
@NoArgsConstructor
//@Table(name = "customer_address")
public class CustomerAddress {

	private Customer customer;

	private Address address;

	public CustomerAddress(Customer customer, Address address) {
		this.customer = customer;
		this.address = address;
	}
}
