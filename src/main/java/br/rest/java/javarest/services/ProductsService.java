package br.rest.java.javarest.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.rest.java.javarest.entities.Product;

@Path("product")
public class ProductsService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("test")
	public String Hello ()
	{
		return "Funcionando";
	}
	
	// ==============================================
	
	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Product> get(){
//		return 
//	}
	
	
}
