package com.fahri;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(value="/kullanici")
public class Merkez {
	public static void main(String[] args) {
		
		System.out.println("Merhaba");
		
	}
	
	@GET
	@Path(value="/karsila1")
	@Produces(MediaType.TEXT_PLAIN)
	public String karsila1() {
		
		return "Selamlar Restfull";
	}

	@GET
	@Path(value="/karsila2")
	@Produces(MediaType.TEXT_PLAIN)
	public Response karsila2() {
		
		return Response.status(200).entity("Selamlar").build();
	}
	//http://localhost:8080/001_RestFulJersey/rest/kullanici/selamla/fahri
	
	@GET
	@Path(value="/selamla/{gelenbilgi}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response karsila3(@PathParam("gelenbilgi") String adi) {
		
		return Response.status(200).entity("Selamla"+adi).build();
	}
	
}
