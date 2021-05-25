package com.hamma.jersey.dao;

import org.bson.Document;
import org.springframework.stereotype.Service;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Service
public class ExempleDao {
	public final static String DATABASE_NAME="testdb";
	private static final String SECDEF_COLLECTION_NAME = "users"; 
	
	public MongoCollection<Document> getCollection () {
		
		MongoClient mongoClient = DbConnector.getInstance().getClient(null);
		MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
		return database.getCollection(SECDEF_COLLECTION_NAME);
	}

}
