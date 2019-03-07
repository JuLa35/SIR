package tddmt;

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

 
	@Column
	protected MailAliment mailAliment;

 
	@Column
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

	
	protected String getIntitule() {
		return this.Intitule;
	}


	protected String getResume() {
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

	
	protected void setIntitule(String myIntitule) {
		this.Intitule = myIntitule;
	}

	
	protected void setResume(String myResume) {
		this.Resume = myResume;
	}

	
	public void setDate(DateR myDate) {
		this.date = myDate;
		
	}


	public void setMailAliment(MailAliment mailAliment) {
		this.mailAliment = mailAliment;
	}


	public void setMailclear(Mailclear mailclear) {
		this.mailclear = mailclear;
	}
	


}

