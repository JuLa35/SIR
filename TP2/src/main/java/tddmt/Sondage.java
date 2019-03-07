package tddmt;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.servlet.http.HttpServlet;

import java.util.Date;
 
@Entity 
public class Sondage{
	 
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id;
	 
	protected Long createurId;
	 
	protected Long dateId;

	public Sondage(){
		super();
	}

	
	public long getId() {
		return this.id;
	}

	 
	public Long getCreateur() {
		return this.createurId;
	}

	
	public Long getDate() {
		return this.dateId;
	}
	
	public void setId(long myId) {
		this.id = myId;
	} 


	public void setCreateur(Long myCreateur) {
		this.createurId = myCreateur;
	}

	
	public void setDateR(Long date) {
		this.dateId = date;
	}
	

}

