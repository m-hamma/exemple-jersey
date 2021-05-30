package com.hamma.jersey.model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

import lombok.Data;

@Data
public class User {
    @BsonId
	private int id;
    @BsonProperty
    private String name;
    @BsonProperty
    private Locale local;

    // standard getters and setters
}
