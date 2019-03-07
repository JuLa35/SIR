package tddmt;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Present implements Serializable{
	
	@Id
	Long idParticipant;
	@Id
	long idSondage;
	
	public Long getId() {
		return idParticipant;
	}
	public void setId(Long id) {
		this.idParticipant = id;
	}
	public long getIdSondage() {
		return idSondage;
	}
	public void setIdSondage(long idSondage) {
		this.idSondage = idSondage;
	}	

}
