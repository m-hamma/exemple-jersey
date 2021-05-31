package com.hamma.jersey.model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import lombok.Data;

@Data
public class User {
	@BsonProperty("_id")
	@BsonId
	private ObjectId id;
    @BsonProperty
    private String name;
    @BsonProperty
    private Locale local;

    // standard getters and setters
}
