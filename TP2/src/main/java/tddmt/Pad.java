package tddmt;
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

	public void setId(long myId) {
		this.id = myId;
	}

	private void setTitre(String myTitre) {
		this.Titre = myTitre;
	}

	private void setNoteReu(String myNoteReu) {
		this.NoteReu = myNoteReu;
	}
}

