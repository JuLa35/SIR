
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import java.util.Date;
 
@Entity 
public class Sondage
{
	 
	@Id 
	@Column(nullable = false) 
	protected Long id;

	 
	protected List<Participant> ListPresent;

	 
	protected List<Participant> ListAbsent;

	 
	@ManyToOne 
	@JoinColumn(nullable = false) 
	protected Createur createur;

	
	 
	@Temporal(TemporalType.DATE) 
	@OneToMany(mappedBy = "sondage") 
	protected Set<Date> date;


	 
	@ManyToMany 
	protected Set<Participant> participant;

	
	 
	@OneToOne 
	protected Pad pad;

		
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

	
	public Set<Date> getDate() {
		if(this.date == null) {
				this.date = new HashSet<Date>();
		}
		return (Set<Date>) this.date;
	}

 
	
	public Set<Participant> getParticipant() {
		if(this.participant == null) {
				this.participant = new HashSet<Participant>();
		}
		return (Set<Participant>) this.participant;
	}


	public Pad getPad() {
		return this.pad;
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


	public void setPad(Pad myPad) {
		this.pad = myPad;
		
	}

}

