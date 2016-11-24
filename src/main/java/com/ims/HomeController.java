package com.ims;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.mvc.Viewable;

@Path("/index")
public class HomeController {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public Viewable get() {

		Map<String, String> model = new HashMap<>();
		model.put("hello", "Hello Darkness");
		model.put("world", "My Old Friend");

		return new Viewable("/jsp/index.jsp", model);
	}

}
