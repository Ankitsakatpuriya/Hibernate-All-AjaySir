package OneToMany2;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;

@Entity
@Table(name="mobile")
public class Mobile {

	
	@Id
	@Column(name="mobileid")
	private int mobileid;
	
	@Column(name="mobilename")
	private String mobilename;
	
	//fetch=FetchType.EAGER,
	@OneToMany(targetEntity=Shop.class, cascade=CascadeType.ALL)
	@JoinColumn(name="hum",referencedColumnName="mobileid")
	 
	
	private Set child;


	public int getMobileid() {
		return mobileid;
	}


	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}


	public String getMobilename() {
		return mobilename;
	}


	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}


	public Set getChild() {
		return child;
	}


	public void setChild(Set child) {
		this.child = child;
	}}
