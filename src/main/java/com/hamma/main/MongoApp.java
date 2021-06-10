package com.hamma.main;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.hamma.jersey.model.Locale;
import com.hamma.jersey.model.User;
import com.mongodb.client.MongoClients;

public class MongoApp {

	//private static final Log log = LogFactory.getLog(MongoApp.class);

	public static void main(String[] args) throws Exception {
		
		List<String> list = Arrays.asList("one", "two", "three");
		
		Consumer<String> afficher = (String param) -> System.out.println(param);
		list.stream().filter(e->e.equals("one")).map(e->e=e+" two").forEach(afficher);

		
	}
}