package com.hamma.jersey.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.hamma.jersey.rest.AbstractResource;



public class DepInjectListener implements ServletContextListener {

    
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		 // Création de l'instance de ManagerFactory
        ManagerFactory vManagerFactory = new ManagerFactory();

        // Injection de l'instance de ManagerFactory dans la classe AbstractResource
        AbstractResource.setManagerFactory(vManagerFactory);
		
	}
}