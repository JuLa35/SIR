package tddmt;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;



@Entity 
public class Mailclear
{ 
	@Column(nullable = false) 
	protected String ClearCode;

	@Id 
	@Column(nullable = false) 
	protected final Long id = 0L;

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

