module com.hamma.rest{
	requires java.base;
	requires spring.core;
	requires spring.context;
	requires spring.web;
	requires spring.beans;
	requires static lombok;
	requires jakarta.ws.rs;
	requires org.mongodb.driver.sync.client;
	requires org.mongodb.bson;
	requires org.mongodb.driver.core;
	exports com.hamma.jersey.rest;
}