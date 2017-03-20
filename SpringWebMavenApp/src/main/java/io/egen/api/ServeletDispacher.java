package io.egen.api;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//we don't want to use the main method, so we use Servlet dispatcher,
//The Spring Web model-view-controller (MVC) framework is designed around a 
//DispatcherServlet that handles all the HTTP requests and responses.
//its a abstract class which implements three methods,
public class ServeletDispacher extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	// where are you configuration classes
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { AppConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	// what kind of endpoints or prefix springs want to have
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] { "/api/*" };
	}

}
