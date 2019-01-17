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


	 
	protected Date DateReu;


	 
	@ManyToOne 
	@JoinColumn(nullable = false) 
	protected Sondage sondage;


	 
	@OneToOne(mappedBy = "date") 
	protected Reunion reunion;


	public DateR(){
		super();
	}


	
	public long getId() {
		return this.id;
	}


	private String getPauseDej() {
		return this.PauseDej;
	}


	private Date getDateReu() {
		return this.DateReu;
	}


	public Sondage getSondage() {
		return this.sondage;
	}


	public Reunion getReunion() {
		return this.reunion;
	}


	public void setId(long myId) {
		this.id = myId;
	}


	private void setPauseDej(String myPauseDej) {
		this.PauseDej = myPauseDej;
	}

	private void setDateReu(Date myDateReu) {
		this.DateReu = myDateReu;
	}

	public void setSondage(Sondage mySondage) {
		this.sondage = mySondage;
	}

	public void setReunion(Reunion myReunion) {
		this.reunion = myReunion;
		
	}


}

