package fr.istic.sir.rest;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tddmt.*;

@Path("/home")
public class SampleWebService {
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello, how are you?";
    }
    
    @GET
	@Path("/sondage")
	@Produces(MediaType.APPLICATION_JSON)
	public Home getHome() {
		Home h = new Home();
		h.setTitle("Tro Dtruk Dan Ma TÃªt");
		List<Sondage> ls = null;
		// lr = toute les reunions de la bdd
		h.setSondages(ls);
		return h;
	}
    
}
