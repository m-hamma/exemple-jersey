package com.hamma.jersey.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.hamma.jersey.rest.MyResource;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/resources")
public class RestConfig extends Application {
	public Set<Class<?>> getClasses() {
		return new HashSet<Class<?>>(
		          Arrays.asList(
		            MyResource.class, 
		            NotFoundExceptionHandler.class, 
		            AlreadyExistsException.class));
	}
}
