
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;


 
@Entity 
public class Participant
{
	
	 
	@Column(nullable = false) 
	protected String Mail;

	
	 
	@Column(nullable = false) 
	protected String Nom;


	 
	@Column(nullable = false) 
	protected String Prenom;

	@ManyToMany(mappedBy = "participant") 
	protected Set<Sondage> sondage;


	 
	@ManyToOne 
	@JoinColumn(nullable = true) 
	protected Mailclear mailclear;


	 
	@ManyToOne 
	@JoinColumn(nullable = true) 
	protected MailAliment mailAliment;


	@Id 
	@Column(nullable = false)
	@GeneratedValue
	protected final Long id = 0L;


	public Participant(){
		super();
	}

	public String getMail() {
		return this.Mail;
	}

	
	public String getNom() {
		return this.Nom;
	}

	
	public String getPrenom() {
		return this.Prenom;
	}

	
	public Set<Sondage> getSondage() {
		if(this.sondage == null) {
				this.sondage = new HashSet<Sondage>();
		}
		return (Set<Sondage>) this.sondage;
	}

	
	public Mailclear getMailclear() {
		return this.mailclear;
	}

	
	public MailAliment getMailAliment() {
		return this.mailAliment;
	}

	
	public long getId() {
		return this.id;
	}

	public void setMail(String myMail) {
		this.Mail = myMail;
	}

	
	public void setNom(String myNom) {
		this.Nom = myNom;
	}

	
	public void setPrenom(String myPrenom) {
		this.Prenom = myPrenom;
	}

	
	
	public void setMailclear(Mailclear myMailclear) {
		this.mailclear = myMailclear;
	}

	
	public void setMailAliment(MailAliment myMailAliment) {
		this.mailAliment = myMailAliment;
	}


}

