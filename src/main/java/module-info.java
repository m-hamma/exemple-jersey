module com.hamma.rest{
	requires java.base;
	requires java.compiler;
	requires spring.core;
	requires spring.context;
	requires spring.web;
	requires spring.beans;
	requires static lombok;
	requires transitive org.mapstruct.processor;
	requires static org.mapstruct;
	requires jakarta.ws.rs;
	requires org.mongodb.driver.sync.client;
	requires org.mongodb.bson;
	requires org.mongodb.driver.core;
	requires spring.jcl;
	requires spring.data.mongodb;
	requires spring.tx;
	requires spring.data.commons;
	requires java.desktop;
	requires jdk.hotspot.agent;
	//requires org.mockito;
	exports com.hamma.jersey.rest;
	exports com.hamma.jersey.service;
	exports com.hamma.jersey.dao;
	exports com.hamma.jersey.dto;
	exports com.hamma.jersey.model;
}