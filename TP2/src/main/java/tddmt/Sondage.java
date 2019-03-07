package tddmt;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.servlet.http.HttpServlet;

import java.util.Date;
 
@Entity 
public class Sondage{
	 
	@Id 
	@Column(nullable = false) 
	protected Long id;

	@Column
	@ElementCollection(targetClass=Participant.class) 
	protected List<Participant> ListPresent;
	
	@Column
	@ElementCollection(targetClass=Participant.class) 
	protected List<Participant> ListAbsent;
	 
	@ManyToOne 
	@JoinColumn(nullable = false) 
	protected Createur createur;
	 
	@Temporal(TemporalType.DATE) 
	@OneToMany(mappedBy = "sondage") 
	protected Set<DateR> date;
	 
	@ManyToMany 
	protected Set<Participant> participant;
		
	public Sondage(){
		super();
	}

	
	public long getId() {
		return this.id;
	}

	 
	
	private List<Participant> getListPresent() {
		return this.ListPresent;
	}
	 
	
	private List<Participant> getListAbsent() {
		return this.ListAbsent;
	}
	 
	
	public Createur getCreateur() {
		return this.createur;
	}

	
	public Set<DateR> getDate() {
		if(this.date == null) {
				this.date = new HashSet<DateR>();
		}
		return (Set<DateR>) this.date;
	}
	
	public Set<Participant> getParticipant() {
		if(this.participant == null) {
				this.participant = new HashSet<Participant>();
		}
		return (Set<Participant>) this.participant;
	}

	
	public void setId(long myId) {
		this.id = myId;
	}

 
	
	private void setListPresent(List<Participant> myListPresent) {
		this.ListPresent = myListPresent;
	} 
	
	private void setListAbsent(List<Participant> myListAbsent) {
		this.ListAbsent = myListAbsent;
	}


	public void setCreateur(Createur myCreateur) {
		this.createur = myCreateur;
	}

	public void addListAbsent(Participant myAbsent) {
		this.ListAbsent.add(myAbsent);
	}
	public void setListPresent(Participant myPresent) {
		this.ListPresent.add(myPresent);
	}
	
	public void addDateR(DateR date) {
		this.date.add(date);
	}
	

}

