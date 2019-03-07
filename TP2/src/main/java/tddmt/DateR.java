package tddmt;
import java.sql.Date;

import javax.persistence.*;


@Entity 
public class DateR
{
	 
	@Id 
	@Column(nullable = false) 
	protected Long id;

	 
	@Column(nullable = false) 
	protected String PauseDej;
	 
	@OneToOne(mappedBy ="date")
	protected Date DateReu;
	 
	@Column
	protected Reunion reunion;


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


	public Reunion getReunion() {
		return this.reunion;
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
	public void setReunion(Reunion myReunion) {
		this.reunion = myReunion;
		
	}


}

