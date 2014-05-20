package com.springjerseydemo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springjerseydemo.model.Demo;
import com.springjerseydemo.service.DemoService;
import com.sun.jersey.core.header.MediaTypes;

@Component
@Path("/demos")
public class DemoResource {

	@Autowired
	private DemoService demoService;
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON) 
	public Response loadDemos()
	{
		Demo demo = demoService.loadRandom();
		return Response.ok(demo).status(200).build();
	}
		
}
