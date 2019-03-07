package tddmt;
import java.sql.Date;

import javax.persistence.*;


@Entity 
public class DateR
{
	 
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id;

	 
	@Column(nullable = false) 
	protected String PauseDej;
	 
	@Column
	protected Date DateReu;
	 
	protected Long reunionId;


	public DateR(){
		super();
	}


	
	public long getId() {
		return this.id;
	}


	protected String getPauseDej() {
		return this.PauseDej;
	}


	protected Date getDateReu() {
		return this.DateReu;
	}


	public Long getReunionId() {
		return this.reunionId;
	}


	public void setId(long myId) {
		this.id = myId;
	}


	protected void setPauseDej(String myPauseDej) {
		this.PauseDej = myPauseDej;
	}

	protected void setDateReu(Date myDateReu) {
		this.DateReu = myDateReu;
	}
	public void setReunion(Long myReunion) {
		this.reunionId = myReunion;
		
	}


}

