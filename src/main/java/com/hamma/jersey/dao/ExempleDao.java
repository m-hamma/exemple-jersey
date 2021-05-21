package com.hamma.jersey.dao;

import org.springframework.stereotype.Service;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Service
public class ExempleDao {
	
	public void getCollection () {
		
		/*MongoClient mongoClient = DbConnector.getInstance().getClient(null)
				database = mongoClient.getDatabase(DATABASE_NAME);
			    collection = database.getCollection(SECDEF_COLLECTION_NAME);*/
	}

}
