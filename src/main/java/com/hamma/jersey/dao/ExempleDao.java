package com.hamma.jersey.dao;

public class ExempleDao {
	
	public void createCollection () {
		DbConnector.getInstance().Createcollection("testdb");
	}

}
