package com.hamma.jersey.rest.client;

import com.hamma.jersey.model.User;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;

public class ExempleClient {

	private static final String REST_URI = "http://localhost:8082/spring-jersey/resources/employees";

	private Client client = ClientBuilder.newClient();

	public User getJsonEmployee(int id) {
		return client.target(REST_URI).path(String.valueOf(id)).request(MediaType.APPLICATION_JSON).get(User.class);
	}
	// ...
}
