package com.hamma.jersey.dao;



import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

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
	
	public void createcollection(String dbName) {
		
	}
	public void showDBs(String connectionString) {
		//String connectionString = "http://localhost:27017/";
		try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));
        }
		
	}

}
