package com.hamma.jersey.config;

import org.springframework.dao.DataAccessException;

import com.mongodb.client.MongoDatabase;

public interface MongoDatabaseFactory {

	  MongoDatabase getDatabase() throws DataAccessException;

	  MongoDatabase getDatabase(String dbName) throws DataAccessException;
	}
