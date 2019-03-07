package tddmt;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
public class User {
	
	@Column(nullable = false) 
	String name;
	
	@Column(nullable = false) 
	String firstName;
	
	@Column(nullable = false) 
	String mail;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
