package tddmt;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;



@Entity 
public class Mailclear
{ 
	@Column(nullable = false) 
	protected String ClearCode;

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id;

	public Mailclear(){
		super();
	}
	
	private String getClearCode() {
		return this.ClearCode;
	}

	
	public long getId() {
		return this.id;
	}
	
	private void setClearCode(String myClearCode) {
		this.ClearCode = myClearCode;
	}
}

