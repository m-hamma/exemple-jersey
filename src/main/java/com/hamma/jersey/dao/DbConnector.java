package com.hamma.jersey.dao;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class DbConnector {

	/** Constructeur privé */
    private DbConnector()
    {}

	/** Instance unique non préinitialisée */
	private static DbConnector INSTANCE = null;

	/** Point d'accès pour l'instance unique du singleton */
	public static synchronized DbConnector getInstance() {
		if (INSTANCE == null) {
			INSTANCE =  new DbConnector();
		}
		return INSTANCE;
	}
	
	public void Createcollection(String dbName) {
		MongoClient client = new MongoClient("localhost", 27017);
		MongoDatabase database = client.getDatabase(dbName);
		
		DBCollection collection = database.getCollection("customers");
		BasicDBObject document = new BasicDBObject();
		document.put("name", "Shubham");
		document.put("company", "Baeldung");
		collection.insert(document);
		
	}
	public void showDBs() {
		MongoClient client = new MongoClient("localhost", 27017);
		client.getUsedDatabases().forEach(System.out::println);
		
	}

}
