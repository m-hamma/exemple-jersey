package com.hamma.jersey.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@ComponentScan(basePackages = "com.hamma.jersey")
@EnableMongoRepositories
public class AppConfig {
	/*
	 * Use the standard Mongo driver API to create a com.mongodb.client.MongoClient
	 * instance.
	 */
	public @Bean MongoClient mongoClient() {
		return MongoClients.create("mongodb://localhost:27017");
	}

	public @Bean MongoTemplate mongoTemplate() {
		return new MongoTemplate(mongoClient(), "test");
	}
}
