

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/home")
public class Home {
	List<Participant> participants;
	List<Reunion> reunions;
	
	@GET
	@Path("/home")
	@Produces(MediaType.APPLICATION_JSON)
	public Home getHome() {
		Home h = new Home();
		List<Participant> lp = null;
		List<Reunion> lr = null;
		// lp =  tout les participant dans la bdd
		// lr = toute les reunions de la bdd
		h.setParticipants(lp);
		h.setReunions(lr);
		return h;
	}
	
	public void setParticipants(List<Participant> lp){
		this.participants = lp;
	}
	public void setReunions(List<Reunion> lr){
		this.reunions = lr;
	}
	public List<Reunion> getReunions(){
		return null;
	}
	public List<Participant> getParticpants(){
		return null;
	}

}
