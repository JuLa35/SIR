import javax.persistence.*;
 
@Entity 
public class Pad
{

	 
	@Id 
	@Column(nullable = false) 
	protected Long id;

	 
	@Column(nullable = false) 
	protected String Titre;

	 
	@Column(nullable = false) 
	protected String NoteReu;

	 
	@OneToOne(mappedBy = "pad") 
	protected Sondage sondage;

	@OneToOne 
	protected Mailclear mailclear;


	public Pad(){
		super();
	}

	public long getId() {
		return this.id;
	}

	
	private String getTitre() {
		return this.Titre;
	}
	
	private String getNoteReu() {
		return this.NoteReu;
	}

	
	public Sondage getSondage() {
		return this.sondage;
	}


	public Mailclear getMailclear() {
		return this.mailclear;
	}

	public void setId(long myId) {
		this.id = myId;
	}

	private void setTitre(String myTitre) {
		this.Titre = myTitre;
	}

	private void setNoteReu(String myNoteReu) {
		this.NoteReu = myNoteReu;
	}

	public void setSondage(Sondage mySondage) {
		this.sondage = mySondage;
		
	}

	public void setMailclear(Mailclear myMailclear) {
		this.mailclear = myMailclear;
		
	}


}

