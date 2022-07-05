package com.hamma.jersey.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.jvnet.hk2.annotations.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.hamma.jersey.model.User;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

@Service
public class ExempleDao {
	public final static String DATABASE_NAME = "test";
	private static final String SECDEF_COLLECTION_NAME = "users";
	private static final String URL = "mongodb://localhost:27017/";
	@Autowired
	UserRepository userRepository;

	public List<User> getCollection() throws InterruptedException, ExecutionException {

		MongoClient mongoClient = DbConnector.getInstance().getClient(URL);
		CodecRegistry pojoCodecRegistry = org.bson.codecs.configuration.CodecRegistries.fromRegistries(
				MongoClientSettings.getDefaultCodecRegistry(), org.bson.codecs.configuration.CodecRegistries
						.fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		// MongoDatabase database =
		// mongoClient.getDatabase(DATABASE_NAME).withCodecRegistry(pojoCodecRegistry);
		MongoOperations mongoOps = new MongoTemplate(MongoClients.create(), "test");
		// database.listCollections().forEach(System::out::println);
		// database.listCollections().forEach((k) -> System.out.println("Key : " + k +
		// ", Value : " + v));
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++" + mongoOps.getCollectionNames().size());
		mongoOps.getCollectionNames().forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++" + name);
			}
		});
		return getMongoDocumentsOther();
	}

	public List<User> getMongoDocuments(MongoDatabase database) throws InterruptedException, ExecutionException {
		// this.database = database;
		List<User> list = new ArrayList<>();

		/*
		 * database.getCollection(SECDEF_COLLECTION_NAME,User.class).find().forEach(
		 * document) -> { try { list.add(document); } catch (Exception e) {
		 * //LOGGER.error("Error while parsing document::" + document.toString(), e); }
		 * 
		 * });
		 */
		// System.out.println("---------->"+
		// database.getCollection(SECDEF_COLLECTION_NAME,User.class).count());

		database.getCollection(SECDEF_COLLECTION_NAME, User.class).find().forEach(new Consumer<User>() {
			@Override
			public void accept(User user) {
				list.add(user);
			}
		});
		System.out.println("----------" + list.size());

		return list;
	}

	public List<User> getMongoDocumentsOther() throws InterruptedException, ExecutionException {
		List<User> list = new ArrayList<>();

		// MongoCursor<Document> iterable =
		// database.getCollection(SECDEF_COLLECTION_NAME).find().cursor();
		// @code: end

		// @pre: Iterate the results and apply a block to each resulting document.
		// @code: start
		Iterable<User> iterable = userRepository.findAll();
		while (iterable.iterator().hasNext()) {
			User user = iterable.iterator().next();
			// System.out.println("---------->"+ user.toJson());
			list.add(user);
		}

		System.out.println("---------->" + list.size());

		System.out.println("----------" + list.size());

		return list;
	}
}
