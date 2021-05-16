package com.hamma.jersey.dao;

import org.springframework.stereotype.Service;

@Service
public class ExempleDao {
	
	public void createCollection () {
		DbConnector.getInstance().createcollection("testdb");
	}

}
