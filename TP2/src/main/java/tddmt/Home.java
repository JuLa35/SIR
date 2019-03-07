package tddmt;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class Home {
	String title;
	List<Sondage> Sondages;
	
	
	public void setSondages(List<Sondage> ls){
		this.Sondages = ls;
	}
	public List<Sondage> getSondages(){
		return this.Sondages;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

}
