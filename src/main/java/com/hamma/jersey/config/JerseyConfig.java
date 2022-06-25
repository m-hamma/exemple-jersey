package com.hamma.jersey.config;

import java.util.Set;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.hamma.jersey.rest.MyResource;

import jakarta.ws.rs.core.Application;

//import org.springframework.stereotype.Component;

//import com.hamma.jersey.rest.MyResource;

@Component
public class JerseyConfig extends jakarta.ws.rs.core.Application {
	@Override
	public Set<Class<?>> getClasses() {
		return Set.of(MyResource.class);
	}
}