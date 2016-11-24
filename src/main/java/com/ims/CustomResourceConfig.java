package com.ims;

import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.server.TracingConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

public class CustomResourceConfig extends ResourceConfig {

	public CustomResourceConfig() {

		// resources controllers
		register(HomeController.class);

		// MVC.
		register(JspMvcFeature.class);
		property(JspMvcFeature.TEMPLATE_BASE_PATH, "/WEB-INF");

		// Logging.
		register(LoggingFeature.class);

		// Tracing support.
		property(ServerProperties.TRACING, TracingConfig.ON_DEMAND.name());

	}

}
