package com.everis.beca.ws.rs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/garage")
public class Garage {
	
	@GET
	@Path("/cars")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Car> getCars(){
	
		return null;
		
	}
	
	@GET
	@Path("/cars/{matricula}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Car getCar(@PathParam("matricula") String matricula) {
		
		Car ferrari = new Car();
		
		ferrari.setColor("RED");
		ferrari.setMatricula(matricula);
		
		return ferrari;

	}
	
	@POST
	@Path("/car")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postStudentRecord(Car car) {
		
		return Response.status(201).entity(car).build();
		
		
	}

}
