package com.hamma.jersey.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.stereotype.Service;

import com.hamma.jersey.model.User;
import java.util.function.Consumer;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Service
public class ExempleDao {
	public final static String DATABASE_NAME="test";
	private static final String SECDEF_COLLECTION_NAME = "users"; 
	private static final String URL = "mongodb://localhost:27017/"; 
	
	public List<User> getCollection () throws InterruptedException, ExecutionException {
		
		MongoClient mongoClient = DbConnector.getInstance().getClient(URL);
		 CodecRegistry pojoCodecRegistry = org.bson.codecs.configuration.CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), org.bson.codecs.configuration.CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME).withCodecRegistry(pojoCodecRegistry);
		//database.listCollections().forEach(System::out::println);
		//database.listCollections().forEach((k) -> System.out.println("Key : " + k + ", Value : " + v));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++"+database.listCollectionNames().first()); 
		database.listCollectionNames().forEach(new Consumer<String>() {
	            @Override
	            public void accept(String name) {
	            	System.out.println("+++++++++++++++++++++++++++++++++++++++++++"+name);
	            }
	        });
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
	    System.out.println("---------->"+  database.getCollection(SECDEF_COLLECTION_NAME,User.class).count());
	    
	    database.getCollection(SECDEF_COLLECTION_NAME,User.class).find().forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
            	 list.add(user);
            }
        });
	    System.out.println("----------"+list.size());

	    return list;
	  }
}
