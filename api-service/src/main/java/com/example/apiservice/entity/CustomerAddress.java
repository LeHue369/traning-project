package com.example.apiservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "customer_address")
public class CustomerAddress {

	private Customer customer;

	private Address address;

	public CustomerAddress(Customer customer, Address address) {
		this.customer = customer;
		this.address = address;
	}
}
