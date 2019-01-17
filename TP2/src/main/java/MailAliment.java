
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity 
public class MailAliment
{
	
	@Column(nullable = false) 
	protected String Lien;

	 
	@OneToOne(mappedBy = "mailAliment") 
	protected Reunion reunion;

	@OneToMany(mappedBy = "mailAliment") 
	protected Set<Participant> participant;


	@Id 
	@Column(nullable = false) 
	protected final Long id = 0L;


	public MailAliment(){
		super();
	}

	private String getLien() {
		return this.Lien;
	}


	public Reunion getReunion() {
		return this.reunion;
	}

	public Set<Participant> getParticipant() {
		if(this.participant == null) {
				this.participant = new HashSet<Participant>();
		}
		return (Set<Participant>) this.participant;
	}

	public long getId() {
		return this.id;
	}


	private void setLien(String myLien) {
		this.Lien = myLien;
	}

	public void setReunion(Reunion myReunion) {
		this.reunion = myReunion;
		
	}

}

