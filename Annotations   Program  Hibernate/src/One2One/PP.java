package One2One;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pp")
public class PP {

	@Id
	@Column(name="idi")
	private int ppid;
	
	@Column(name="ppname")
	private String ppname;

	
	
	
	
	
	public int getPpid() {
		return ppid;
	}

	public void setPpid(int ppid) {
		this.ppid = ppid;
	}

	public String getPpname() {
		return ppname;
	}

	public void setPpname(String ppname) {
		this.ppname = ppname;
	}
	
	
	
	
	
	
	
}
