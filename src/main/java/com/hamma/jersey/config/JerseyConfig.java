package com.hamma.jersey.config;

import org.glassfish.jersey.server.ResourceConfig;

import com.hamma.jersey.rest.MyResource;
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
    	// this.register(AutoScanFeature.class);
    	this.register(MyResource.class);
    }
}