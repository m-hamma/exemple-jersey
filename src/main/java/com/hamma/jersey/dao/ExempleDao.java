package com.hamma.jersey.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.bson.Document;
import org.springframework.stereotype.Service;

import com.hamma.jersey.model.User;
import java.util.function.Consumer;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Service
public class ExempleDao {
	public final static String DATABASE_NAME="testdb";
	private static final String SECDEF_COLLECTION_NAME = "users"; 
	private static final String URL = "http://localhost:27017/"; 
	
	public List<User> getCollection () throws InterruptedException, ExecutionException {
		
		MongoClient mongoClient = DbConnector.getInstance().getClient(URL);
		MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
		return getMongoDocuments(database);
	}
	public List<User> getMongoDocuments(MongoDatabase database) throws InterruptedException, ExecutionException {
	    List<User> list = new ArrayList<>();

	   /* database.getCollection(SECDEF_COLLECTION_NAME,User.class).find().forEach(document) -> {
	      try {
	        list.add(document);
	      } catch (Exception e) {
	        //LOGGER.error("Error while parsing document::" + document.toString(), e);
	      }

	    });*/
	    
	    database.getCollection(SECDEF_COLLECTION_NAME,User.class).find().forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
            	 list.add(user);
            }
        });

	    return list;
	  }
}
