package com.hamma.jersey.config;

import org.springframework.data.web.config.ProjectingArgumentResolverRegistrar;

import com.hamma.jersey.dto.ProjectManager;
import com.hamma.jersey.dto.TicketManager;

public class ManagerFactory {
	
	public ProjectManager getProjectManager () {
		return new ProjectManager();
	}
	public TicketManager getTicketManager () {
		return new TicketManager();
	}
}
