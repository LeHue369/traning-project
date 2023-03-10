package com.example.apiservice.client;

import com.example.apiservice.entity.Address;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AddressClient {
	private final RestTemplate restTemplate;
	private final String baseUrl;

	public AddressClient(
		RestTemplate restTemplate,
		@Value("${addressClient.baseUrl}") String baseUrl) {
		this.restTemplate = restTemplate;
		this.baseUrl = baseUrl;
	}

	public Address getAddressForCustomerId(long id) {
		return restTemplate.getForObject(String.format("%s/addresses/%d", baseUrl, id), Address.class);
	}
}
