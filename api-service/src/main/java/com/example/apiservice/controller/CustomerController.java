package com.example.apiservice.controller;

import com.example.apiservice.client.CustomerClient;
import com.example.apiservice.client.AddressClient;
import com.example.apiservice.entity.Address;
import com.example.apiservice.entity.Customer;
import com.example.apiservice.entity.CustomerAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers/")
public class CustomerController {

	private CustomerClient customerClient;

	private AddressClient addressClient;

	private Logger logger = LoggerFactory.getLogger(CustomerController.class);

	public CustomerController(CustomerClient customerClient, AddressClient addressClient) {
		this.customerClient = customerClient;
		this.addressClient = addressClient;
	}

	@GetMapping(path = "customers/{id}")
	public CustomerAddress getCustomerWithAddress(@PathVariable("id") long customerId){
		logger.info("COLLECTING CUSTOMER AND ADDRESS WITH ID {} FROM UPSTREAM SERVICE", customerId);
		Customer customer = customerClient.getCustomer(customerId);
		Address address = addressClient.getAddressForCustomerId(customerId);
		return new CustomerAddress(customer, address);
	}
}
