package com.hamma.jersey.rest;

import com.hamma.jersey.config.ManagerFactory;

public abstract class AbstractResource {
	private static ManagerFactory managerFactory ;

	protected static ManagerFactory getManagerFactory() {
		return managerFactory;
	}

	public static void setManagerFactory(ManagerFactory managerFactory) {
		AbstractResource.managerFactory = managerFactory;
	}
	

}
