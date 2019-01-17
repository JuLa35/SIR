
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;



@Entity 
public class Mailclear
{
 
	protected String LienPad;

 
	@Column(nullable = false) 
	protected String ClearCode;

 
	@OneToOne(mappedBy = "mailclear") 
	protected Pad pad;

	@OneToMany(mappedBy = "mailclear") 
	protected Set<Participant> participant;

	 
	@OneToOne(mappedBy = "mailclear") 
	protected Reunion reunion;


	@Id 
	@Column(nullable = false) 
	protected final Long id = 0L;

	public Mailclear(){
		super();
	}
	
	private String getLienPad() {
		return this.LienPad;
	}

	
	private String getClearCode() {
		return this.ClearCode;
	}

	
	public Pad getPad() {
		return this.pad;
	}

	public Set<Participant> getParticipant() {
		if(this.participant == null) {
				this.participant = new HashSet<Participant>();
		}
		return (Set<Participant>) this.participant;
	}

	
	public Reunion getReunion() {
		return this.reunion;
	}

	
	public long getId() {
		return this.id;
	}

	void setLienPad(String myLienPad) {
		this.LienPad = myLienPad;
	}

	
	private void setClearCode(String myClearCode) {
		this.ClearCode = myClearCode;
	}

	
	public void setPad(Pad myPad) {
		this.pad = myPad;
		
	}

	public void setReunion(Reunion myReunion) {
		this.reunion = myReunion;
		
	}
}

