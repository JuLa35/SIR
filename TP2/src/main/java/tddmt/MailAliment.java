package tddmt;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity 
public class MailAliment
{
	
	@Column(nullable = false) 
	protected String Lien;

	@Id 
	@Column(nullable = false) 
	protected final Long id = 0L;


	public MailAliment(){
		super();
	}

	private String getLien() {
		return this.Lien;
	}

	public long getId() {
		return this.id;
	}

	private void setLien(String myLien) {
		this.Lien = myLien;
	}
}

