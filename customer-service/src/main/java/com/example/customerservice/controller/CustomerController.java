package com.example.customerservice.controller;

import java.util.Arrays;
import java.util.List;

import com.example.customerservice.entity.Address;
import com.example.customerservice.entity.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	private Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@GetMapping(path = "customers/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") long customerId) {
		logger.info("GETTING CUSTOMER WITH ID {}", customerId);
		if (customerId < 0 || customerId > NAMES.size() - 1) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		Customer customer = new Customer();
		customer.setId(customerId);
		customer.setName(NAMES.get((int) customerId));

		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	@GetMapping(path = "addresses/{id}")
	public ResponseEntity<Address> getAddress(@PathVariable("id") long customerId) throws InterruptedException {
		logger.info("GETTING ADDRESS FOR CUSTOMER WITH ID {}", customerId);
		if (customerId < 0 || customerId > NAMES.size() - 1) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		Address address = new Address();
		address.setId(customerId);
		address.setStreet(STREETS.get((int) customerId));

		return new ResponseEntity<>(address, HttpStatus.OK);
	}

	private static final List<String> STREETS = Arrays.asList(
		"Jefferson Street",
		"Cambridge Road",
		"Olive Street");

	private static final List<String> NAMES = Arrays.asList(
		"Daria Domino",
		"Yukiko Yawn",
		"Diane Dalessio",
		"Elijah Elmore");
}
