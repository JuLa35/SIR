
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@Entity 
public class Createur
{

	 
	@Id 
	@Column(nullable = false) 
	protected Long id;


	@OneToMany(mappedBy = "createur") 
	protected Set<Sondage> sondage;


	public Createur(){
		super();
	}


	public long getId() {
		return this.id;
	}


	public Set<Sondage> getSondage() {
		if(this.sondage == null) {
				this.sondage = new HashSet<Sondage>();
		}
		return (Set<Sondage>) this.sondage;
	}


	public void setId(long myId) {
		this.id = myId;
	}

	

}

