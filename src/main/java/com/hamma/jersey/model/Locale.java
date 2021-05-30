package com.hamma.jersey.model;

import org.bson.codecs.pojo.annotations.BsonProperty;

import lombok.Data;

@Data
public class Locale {
	@BsonProperty
	private String email;
}
