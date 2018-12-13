package br.rest.java.javarest.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.rest.java.javarest.services.ProductsService;
import br.rest.java.javarest.services.test.MyResource;
import br.rest.java.javarest.services.test.NotesService;

@ApplicationPath("v1")
public class Startup extends Application{

	@Override
	public Set<Class<?>> getClasses(){
		final Set<Class<?>> classes = new HashSet<>();
		classes.add(ProductsService.class);
//		classes.add(NotesService.class);
//		classes.add(MyResource.class);
		return classes;
	}
}
