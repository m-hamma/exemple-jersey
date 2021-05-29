package com.hamma.jersey.dao;

import com.mongodb.Block;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.connection.ClusterSettings;
import com.mongodb.connection.ClusterSettings.Builder;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

public class DbConnector {

	/** Constructeur privé */
	private DbConnector() {
	}

	/** Instance unique non préinitialisée */
	private static DbConnector INSTANCE = null;

	/** Point d'accès pour l'instance unique du singleton */
	public static synchronized DbConnector getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DbConnector();
		}
		return INSTANCE;
	}

	public void createcollection() {

	}

	public MongoClient getClient(String conn) {
		/*Block<ClusterSettings.Builder> clusterSettings = new Block<ClusterSettings.Builder>() {
			@Override
			public void apply(Builder t) {
				this.apply(t.hosts(servers));
				
			}};
			MongoClient mongoClient = new MongoClient();
				
	    MongoClientSettings settings = MongoClientSettings.builder().applyToClusterSettings(clusterSettings).build();*/
	    return MongoClients.create(conn);
		
	}

}
