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

	protected Long mailAlimentId;

	protected Long mailclearId;
	 
	protected Long dateId;

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

	
	public Long getMailAliment() {
		return this.mailAlimentId;
	}

	
	public Long getMailclear() {
		return this.mailclearId;
	}

	
	public Long getDate() {
		return this.dateId;
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

	
	public void setDate(Long myDate) {
		this.dateId = myDate;
		
	}


	public void setMailAliment(Long mailAliment) {
		this.mailAlimentId = mailAliment;
	}


	public void setMailclear(Long mailclear) {
		this.mailclearId = mailclear;
	}
	


}

