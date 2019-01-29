
import java.util.Date;
import javax.persistence.*;

 
@Entity 
public class Reunion
{

	 
	@Id 
	@Column(nullable = false) 
	protected Long id;


	@Column(nullable = false) 
	protected String Intitule;


	@Column(nullable = false) 
	protected String Resume;

 
	@OneToOne 
	protected MailAliment mailAliment;

 
	@OneToOne 
	protected Mailclear mailclear;
	 
	@Temporal(TemporalType.DATE) 
	@OneToOne 
	protected DateR date;

	public Reunion(){
		super();
	}

	
	public long getId() {
		return this.id;
	}

	
	private String getIntitule() {
		return this.Intitule;
	}


	private String getResume() {
		return this.Resume;
	}

	
	public MailAliment getMailAliment() {
		return this.mailAliment;
	}

	
	public Mailclear getMailclear() {
		return this.mailclear;
	}

	
	public DateR getDate() {
		return this.date;
	}

	public void setId(long myId) {
		this.id = myId;
	}

	
	private void setIntitule(String myIntitule) {
		this.Intitule = myIntitule;
	}

	
	private void setResume(String myResume) {
		this.Resume = myResume;
	}

	
	public void setDate(DateR myDate) {
		this.date = myDate;
		
	}


}

