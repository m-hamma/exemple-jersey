package com.hamma.jersey.config;
import java.lang.reflect.InvocationHandler;

import org.glassfish.jersey.server.internal.inject.ConfiguredValidator;
import org.glassfish.jersey.server.model.Invocable;
import org.glassfish.jersey.server.spi.internal.ResourceMethodDispatcher;
import org.glassfish.jersey.server.spi.internal.ResourceMethodDispatcher.Provider;
public class AlreadyExistsException implements Provider{

	@Override
	public ResourceMethodDispatcher create(Invocable method, InvocationHandler handler, ConfiguredValidator validator) {
		return null;
	}

}
