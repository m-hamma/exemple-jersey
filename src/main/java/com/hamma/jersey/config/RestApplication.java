package com.hamma.jersey.config;

import java.util.Set;

import com.hamma.jersey.rest.MyResource;

import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("rest")
public class RestApplication extends jakarta.ws.rs.core.Application {

    public RestApplication() {
    }

    @Override public Set<Class<?>> getClasses() {
        return Set.of(
            MyResource.class
        );
    }
}
