package br.rest.java.javarest.services.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.rest.java.javarest.entities.Note;

@Path("nota")
public class NotesService {
	private List<Note> lista = new ArrayList<Note>();

	public NotesService() {
		CriarNotas();
	}

	private void CriarNotas() {
		int count = 0;
		for (int i = 0; i < 5; i = count) {
			Note n = new Note("Title " + i, "Description " + i);
			lista.add(n);
			count = count + 1;
		}
	}

	
	@GET
	@Path("oi")
	@Produces(MediaType.TEXT_PLAIN)
	public String oi()
	{
		return "funcionando";
	}
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getNotas() {
		
		return Response.status(Response.Status.OK)
				.entity(lista)
				.build();
	}

	@GET
	@Path("str")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getNotasString() {

		String msg = "{ Status: + " + Response.Status.OK.toString() 
						+ ", result: " + lista.toString() + "}";

		@SuppressWarnings("unused")
		int getCodigo = Response.Status.OK.getStatusCode();
		
		return Response.status(Response.Status.OK).entity(msg)
				.type(MediaType.APPLICATION_JSON).build();

		// return lista.toString();
	}

	@GET
	@Path("{nota_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getNotasPorId(@PathParam("nota_id") String notaId) {
		for (Note n : lista) {
			if (notaId.equals(n.getId())) {
				return n.toString();
			}
		}

		return "Id: " + notaId + " : Não encontrado";

	}
}
