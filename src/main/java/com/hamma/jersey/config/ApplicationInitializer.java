package com.hamma.jersey.config;

import java.util.EnumSet;
import java.util.Set;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletException;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.beans.factory.support.SimpleSecurityContextProvider;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.filter.CharacterEncodingFilter;
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) {
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();

		 rootContext.register(RequestContextFilter.class);
		rootContext.register(AppConfig.class); //
		// rootContext.register(MyResource.class); //
		// rootContext.register(ExempleService.class);

		container.setInitParameter("log4jConfiguration", "/WEB-INF/custom-name-log4j.xml");

		rootContext.setConfigLocation("com.hamma.jersey");

		final FilterRegistration.Dynamic characterEncodingFilter = container.addFilter("characterEncodingFilter",
				new CharacterEncodingFilter()); //
		// characterEncodingFilter.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType
		// .class), // true, "/*");
		// characterEncodingFilter.setInitParameter("encoding","UTF-8");
		characterEncodingFilter.setInitParameter("forceEncoding", "true");

		container.setInitParameter("spring.profiles.default", "prod");

		rootContext.register(SimpleSecurityContextProvider.class);

		container.addListener(new ContextLoaderListener(rootContext));
		container.addListener(new RequestContextListener());

		container.setInitParameter("contextConfigLocation", "");

		final ServletContainer servlet = new ServletContainer();
		final ServletRegistration.Dynamic appServlet = container.addServlet("appServlet", servlet.getClass().getName());
		appServlet.setInitParameter("jersey.config.server.provider.packages", "com.hamma.jersey");
		appServlet.setLoadOnStartup(1);

		final Set<String> mappingConflicts = appServlet.addMapping("/resources/*");

	}


	// @Override
//	/*
//	 * public void onStartup(ServletContext servletContext) { System.out.println(
//	 * "------------------------------------------------------------------->"+
//	 * servletContext.toString()); //Tell jersey-spring3 the context is already
//	 * initialized
//	 * 
//	 * servletContext.setInitParameter("contextConfigLocation", "NOTNULL");
//	 * AnnotationConfigWebApplicationContext appContext = new
//	 * AnnotationConfigWebApplicationContext();
//	 * appContext.register(AppConfig.class); servletContext.addListener(new
//	 * ContextLoaderListener(appContext)); }
//	 */
//	public void onStartup(ServletContext servletContext) {
//		/*// Don't create the Listener that Jersey uses to create.
//		// There can only be one linstener
//		servletContext.setInitParameter("contextConfigLocation", "<NONE>");
//		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//
//		// Add app config packages
//		context.setConfigLocation("com.hamma.jersey.config");
//		context.register(AppConfig.class);
//		// Add listener to the context
//		servletContext.addListener(new ContextLoaderListener(context));
//
//		// Replacing:
//		// <servlet-name>ServletName</servlet-name>
//		// <servlet-class>com.sun.jersey.spi.spring.container.servlet.SpringServlet</servlet-class>
//		// <init-param>
//		// <param-name>com.sun.jersey.config.property.packages</param-name>
//		// <param-value>webservices.packages</param-value>
//		// </init-param>
//		// <load-on-startup>1</load-on-startup>
//		AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
//
//		ServletRegistration.Dynamic appServlet = servletContext.addServlet("ServletName",
//				new DispatcherServlet(dispatcherContext));
//		
//		//appServlet.setInitParameter("com.sun.jersey.config.property.packages", "com.hamma.jersey.rest");
//		appServlet.setLoadOnStartup(1);
//		appServlet.addMapping("/RootApp");
//		 
//		        AnnotationConfigWebApplicationContext context 
//		          = new AnnotationConfigWebApplicationContext();
//		 
//		        servletContext.addListener(new ContextLoaderListener(context));
//		        servletContext.setInitParameter(
//		          "contextConfigLocation", "com.hamma.jersey");*/
//	}
}
