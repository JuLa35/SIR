package tddmt;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity 
public class MailAliment
{
	
	@Column(nullable = false) 
	protected String Lien;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id;


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

