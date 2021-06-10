package com.hamma.jersey.model;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2171351263785647467L;
	@BsonProperty("_id")
	@BsonId
	private ObjectId id;
    @BsonProperty
    private String name;
    @BsonProperty
    private Locale local;

    // standard getters and setters
}
